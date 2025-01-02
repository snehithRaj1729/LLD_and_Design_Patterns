package Expressions;

import AbstractExpressionInterface.AbstractExpression;
import Context.Context;

public class SumNonTerminalExpression implements AbstractExpression{
    AbstractExpression leftExpression;

    public SumNonTerminalExpression(AbstractExpression leftExpression, AbstractExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    AbstractExpression rightExpression;
    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context)+ rightExpression.interpret(context);
    }
}
