package Expressions;

import AbstractExpressionInterface.AbstractExpression;
import Context.Context;

public class NumberTerminalExpression implements AbstractExpression {

    String variable;

    public NumberTerminalExpression(String variable) {
        this.variable = variable;
    }

    @Override
    public int interpret(Context context) {
        return context.get(variable);
    }
}
