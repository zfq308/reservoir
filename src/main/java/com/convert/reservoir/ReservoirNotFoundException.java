/*
 * Copyright (c)  2010 Ghais Issa and others. All rights reserved.
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
 *
 * Contributors :
 *     ...
 */

package com.convert.reservoir;

/**
 * An exception indicating that a reservoir couldn't be found.
 * @author Ghais Issa
 */
public class ReservoirNotFoundException extends ReservoirException {
    public ReservoirNotFoundException() {
        super();
    }

    public ReservoirNotFoundException(String message) {
        super(message);
    }

    public ReservoirNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReservoirNotFoundException(Throwable cause) {
        super(cause);
    }
}
