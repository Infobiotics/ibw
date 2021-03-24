package roadblock.importing.sbml;

import java.util.List;

import org.sbml.jsbml.ASTNode;
import org.sbml.jsbml.CallableSBase;
import org.sbml.jsbml.KineticLaw;
import org.sbml.jsbml.LocalParameter;
import org.sbml.jsbml.Parameter;
import org.sbml.jsbml.SBMLException;
import org.sbml.jsbml.util.compilers.ASTNodeValue;
import org.sbml.jsbml.util.compilers.FormulaCompilerLibSBML;

public class IBLExpressionCompiler extends FormulaCompilerLibSBML {

	private static IBLExpressionCompiler instance;
	
	public static IBLExpressionCompiler getInstance() {
		if(instance == null) {
			instance = new IBLExpressionCompiler();
		}
		
		return instance;
	}

	@Override
	public ASTNodeValue compile(CallableSBase variable) {
		if (variable instanceof LocalParameter) {
			LocalParameter localParameter = (LocalParameter) variable;
			return super.compile(Double.toString(localParameter.getValue()));
		}

		if (variable instanceof Parameter) {
			Parameter parameter = (Parameter) variable;
			return super.compile(Double.toString(parameter.getValue()));
		}

		return super.compile(String.format("[%s]", variable.getId()));
	}

	@Override
	public ASTNodeValue plus(List<ASTNode> nodes) throws SBMLException {
		StringBuffer plus = new StringBuffer();
		if (nodes.size() == 0) {
			return new ASTNodeValue("", this);
		}

		plus.append(checkBrackets(nodes.get(0)));

		for (int i = 1; i < nodes.size(); i++) {
			plus.append('+');
			plus.append(checkBrackets(nodes.get(i)));
		}
		
		return new ASTNodeValue(plus.toString(), this);

	}

	private IBLExpressionCompiler() { }
}
