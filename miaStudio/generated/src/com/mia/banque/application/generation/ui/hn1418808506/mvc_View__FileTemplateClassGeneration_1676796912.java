package com.mia.banque.application.generation.ui.hn1418808506;

import com.mia.formation.mvc.*;
import com.mia.metamodel.*;
import com.mia.openapi.*;
import com.mia.openapi.refactoring.model.*;
import com.mia.openapi.reflect.*;
import com.mia.resource.*;
import java.io.*;
import java.util.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.util.*;

@SuppressWarnings({"unused","unchecked","rawtypes","nls","serial",})
public class mvc_View__FileTemplateClassGeneration_1676796912 implements com.mia.studio.kernel.compiler.CompiledAction {

	public mvc_View__FileTemplateClassGeneration_1676796912() {
		//Do nothing
	}

	//For internal use only
	mvc_View__FileTemplateClassGeneration_1676796912(int anyInt, List anyList) {
		List<java.lang.Integer> otherList = anyList;
		throw new java.lang.UnsupportedOperationException();
	}

	private static <T> T __check_arg__(java.lang.Class<T> expectedClass, Object argument) {
		T result = null;
		if (java.lang.Integer.class.equals(expectedClass) && argument instanceof Double) {
			result = (T) new java.lang.Integer(((Double) argument).intValue());
		} else if (java.lang.Float.class.equals(expectedClass) && argument instanceof Double) {
			result = (T) new java.lang.Float(((Double) argument).floatValue());
		} else {
			try {			
				result = expectedClass.cast(argument);
			} catch(Throwable ex) {
				throw new IllegalArgumentException(
						String.format(
								"Bad parameter type in call to %s. Found '%s' when expected '%s'.",
								"FileTemplateClassGeneration", argument.getClass().getName(),
								expectedClass.getName()));
			}
		}
		return result;
	}


	public java.lang.Object evaluate(java.lang.Object[] _action_parameters) {
		return runAction(_action_parameters);
	}

	public String runAction(java.lang.Object[] _action_parameters) {
		if (_action_parameters.length != 3)
			throw new IllegalArgumentException("Wrong number of parameters in call to ''FileTemplateClassGeneration''");

		final com.mia.formation.mvc.View current = __check_arg__(com.mia.formation.mvc.View.class, _action_parameters[0]);
		final com.mia.openapi.gen.Context context = __check_arg__(com.mia.openapi.gen.Context.class, _action_parameters[1]);
		final com.mia.openapi.gen.GenerationServicesManager manager = __check_arg__(com.mia.openapi.gen.GenerationServicesManager.class, _action_parameters[2]);

		return __invoke_user_code__(current, context, manager);
	}

	public String __invoke_user_code__(final com.mia.formation.mvc.View current, final com.mia.openapi.gen.Context context, final com.mia.openapi.gen.GenerationServicesManager manager)
{

java.lang.StringBuffer _template_buffer = new java.lang.StringBuffer();
_template_buffer.append("package com.mia.banque.ui.view.swt;");
_template_buffer.append('\n');
_template_buffer.append('\n');

_template_buffer.append(manager.action(current, "TextTemplateImportSwtTools"));_template_buffer.append('\n');

_template_buffer.append(manager.action(current, "TextTemplateImportFilesProject"));_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("public class ");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append(" extends Shell implements I");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append(" {");
_template_buffer.append('\n');
_template_buffer.append("	");
_template_buffer.append('\n');
_template_buffer.append("	private I");
_template_buffer.append(manager.action(current, "MacroModelName"));_template_buffer.append("Controler controler;");
_template_buffer.append('\n');
_template_buffer.append("	private I");
_template_buffer.append(manager.action(current, "MacroModelName"));_template_buffer.append(" model;");
_template_buffer.append('\n');
_template_buffer.append("	");
_template_buffer.append(manager.action(current, "MacroListViewDeclaration"));_template_buffer.append('\n');
_template_buffer.append("	");
_template_buffer.append('\n');

_template_buffer.append(manager.action(current, "MacroButtonsDeclaration"));_template_buffer.append("	");
_template_buffer.append('\n');

_template_buffer.append(manager.action(current, "TextTemplateConstructorDeclaration"));_template_buffer.append("	");
_template_buffer.append('\n');

_template_buffer.append(manager.action(current, "MacroMethodsImplementation"));_template_buffer.append('\n');
_template_buffer.append("	");
_template_buffer.append('\n');
_template_buffer.append("}");
return _template_buffer.toString();

}
}
