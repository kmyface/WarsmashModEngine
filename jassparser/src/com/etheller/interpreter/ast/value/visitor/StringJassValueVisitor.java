package com.etheller.interpreter.ast.value.visitor;

import com.etheller.interpreter.ast.value.ArrayJassValue;
import com.etheller.interpreter.ast.value.BooleanJassValue;
import com.etheller.interpreter.ast.value.CodeJassValue;
import com.etheller.interpreter.ast.value.HandleJassValue;
import com.etheller.interpreter.ast.value.IntegerJassValue;
import com.etheller.interpreter.ast.value.JassValueVisitor;
import com.etheller.interpreter.ast.value.RealJassValue;
import com.etheller.interpreter.ast.value.StringJassValue;

public class StringJassValueVisitor implements JassValueVisitor<String> {
	private static final StringJassValueVisitor INSTANCE = new StringJassValueVisitor();

	public static StringJassValueVisitor getInstance() {
		return INSTANCE;
	}

	@Override
	public String accept(final IntegerJassValue value) {
		return null;
	}

	@Override
	public String accept(final RealJassValue value) {
		return null;
	}

	@Override
	public String accept(final BooleanJassValue value) {
		return null;
	}

	@Override
	public String accept(final StringJassValue value) {
		return value.getValue();
	}

	@Override
	public String accept(final CodeJassValue value) {
		return null;
	}

	@Override
	public String accept(final ArrayJassValue value) {
		return null;
	}

	@Override
	public String accept(final HandleJassValue value) {
		return null;
	}

}
