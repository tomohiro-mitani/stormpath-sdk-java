/*
 * Copyright 2015 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stormpath.sdk.servlet.authc.impl;

import com.stormpath.sdk.authc.AuthenticationRequest;
import com.stormpath.sdk.authc.AuthenticationResult;
import com.stormpath.sdk.lang.Assert;
import com.stormpath.sdk.servlet.authc.SuccessfulAuthenticationRequestEvent;
import com.stormpath.sdk.servlet.event.RequestEventListener;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @since 1.0.RC3
 */
public class DefaultSuccessfulAuthenticationRequestEvent extends AbstractAuthenticationRequestEvent
    implements SuccessfulAuthenticationRequestEvent {

    private final AuthenticationResult result;

    public DefaultSuccessfulAuthenticationRequestEvent(HttpServletRequest request, HttpServletResponse response,
                                                       AuthenticationRequest authcRequest, AuthenticationResult result) {
        super(request, response, authcRequest);
        Assert.notNull(result, "AuthenticationResult argument cannot be null.");
        this.result = result;
    }

    @Override
    public AuthenticationResult getAuthenticationResult() {
        return this.result;
    }

    @Override
    public void accept(RequestEventListener listener) {
        listener.on(this);
    }
}
