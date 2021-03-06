/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.engine.impl.delegate;

import org.camunda.bpm.engine.delegate.VariableScope;
import org.camunda.bpm.engine.impl.context.Context;
import org.camunda.bpm.engine.impl.scripting.ExecutableScript;

/**
 * @author Roman Smirnov
 *
 */
public class ScriptInvocation extends DelegateInvocation {

  protected ExecutableScript script;
  protected VariableScope scope;

  public ScriptInvocation(ExecutableScript script, VariableScope scope) {
    this.script = script;
    this.scope = scope;
  }

  protected void invoke() throws Exception {
    invocationResult = Context
      .getProcessEngineConfiguration()
      .getScriptingEnvironment()
      .execute(script, scope);
  }

  public Object getTarget() {
    return script;
  }

}
