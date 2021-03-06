/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.gwt.elemento.sample.gin.client;

import elemental2.dom.HTMLElement;
import org.jboss.gwt.elemento.core.IsElement;
import org.jboss.gwt.elemento.sample.common.I18n;
import org.jboss.gwt.elemento.template.Templated;

@SuppressWarnings("unused")
@Templated("Todo.html#info")
public abstract class FooterElement implements IsElement<HTMLElement> {

    static FooterElement create(I18n i18n) {
        return new Templated_FooterElement(i18n);
    }

    abstract I18n i18n();
}
