package com.etheller.interpreter.ast.statement;

import com.etheller.interpreter.ast.expression.JassExpression;
import com.etheller.interpreter.ast.scope.GlobalScope;
import com.etheller.interpreter.ast.scope.LocalScope;
import com.etheller.interpreter.ast.value.JassValue;

public class JassReturnStatement implements JassStatement {
	private final int lineNo;
	private final JassExpression expression;

	public JassReturnStatement(final int lineNo, final JassExpression expression) {
		this.lineNo = lineNo;
		this.expression = expression;
	}

	@Override
	public JassValue execute(final GlobalScope globalScope, final LocalScope localScope) {
		globalScope.setLineNumber(this.lineNo);
		return this.expression.evaluate(globalScope, localScope);
	}

}
