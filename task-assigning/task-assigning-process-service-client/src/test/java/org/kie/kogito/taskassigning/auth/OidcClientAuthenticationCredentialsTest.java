/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.kogito.taskassigning.auth;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class OidcClientAuthenticationCredentialsTest {

    private static final String OIDC_CLIENT = "OIDC_CLIENT";

    @Test
    void getOidcClient() {
        OidcClientAuthenticationCredentials credentials = OidcClientAuthenticationCredentials.newBuilder()
                .oidcClient(OIDC_CLIENT)
                .build();
        assertThat(credentials.getOidcClient()).isEqualTo(OIDC_CLIENT);
    }

    @Test
    void buildWithNullOidcClientFailure() {
        assertThatThrownBy(() -> OidcClientAuthenticationCredentials.newBuilder().oidcClient(null).build())
                .hasMessage("The oidcClient can not be null");
    }
}
