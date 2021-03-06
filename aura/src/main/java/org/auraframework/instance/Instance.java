/*
 * Copyright (C) 2013 salesforce.com, inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.auraframework.instance;

import org.auraframework.def.DefDescriptor;
import org.auraframework.def.Definition;
import org.auraframework.util.json.JsonSerializable;

/**
 */
public interface Instance<T extends Definition> extends JsonSerializable {
    /**
     * @return the Descriptor for the definition of which this is an instance
     */
    DefDescriptor<T> getDescriptor();

    /**
     * Get the 'path' of this component in the component tree.
     *
     * This path consists of the set of attributes and indices that leads to 
     * where this component was instantiated. This path must match the client
     * generated path.
     *
     * @return the string representation of the path.
     */
    String getPath();
}
