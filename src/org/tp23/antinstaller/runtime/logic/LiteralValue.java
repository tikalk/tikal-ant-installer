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

package org.tp23.antinstaller.runtime.logic;

/**
 * @author mwilson
 * @version $Id: LiteralValue.java,v 1.2 2006/12/21 00:03:18 teknopaul Exp $
 * @since 0.7.4 patch 2
 */
public class LiteralValue implements Value {
	
	public static final String NULL = "null";
	private final String value;

	public LiteralValue(final String value) {
		if ((value != null) && (value.equals(NULL))) {
			this.value = null;
		} else {
			this.value = value;
		}
	}

	public String getValue() {
		return value;
	}
}
