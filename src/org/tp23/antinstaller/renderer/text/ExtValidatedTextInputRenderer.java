/* 
 * Copyright 2005 Paul Hinds
 *
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
package org.tp23.antinstaller.renderer.text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import org.tp23.antinstaller.input.ExtValidatedTextInput;
import org.tp23.antinstaller.input.OutputField;
import org.tp23.antinstaller.input.Validator;


public class ExtValidatedTextInputRenderer
	extends ValidatedTextInputRenderer {

	public void renderError(OutputField field, BufferedReader reader, PrintStream out) throws IOException{
		ExtValidatedTextInput extVal = (ExtValidatedTextInput) field;
		Validator validator = extVal.getValidator();
		Throwable t = extVal.getThrowable();
		String message = validator.getErrorMessage(t,null);
		out.println(message);
		renderOutput(field, reader, out);
	}
}
