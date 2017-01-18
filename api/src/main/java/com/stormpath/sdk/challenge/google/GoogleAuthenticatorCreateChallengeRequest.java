/*
 * Copyright 2017 Stormpath, Inc.
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
package com.stormpath.sdk.challenge.google;

import com.stormpath.sdk.challenge.CreateChallengeRequest;

/**
 * A Google Authenticator specific create challenge request
 *
 * Google Authenticator challenges can validate a code at the same time that the challenge is created.
 *
 * @since 1.4.0
 */
public interface GoogleAuthenticatorCreateChallengeRequest extends CreateChallengeRequest {}