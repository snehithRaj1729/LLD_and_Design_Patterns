import AbstractExpressionInterface.AbstractExpression;
import Context.Context;
import Expressions.MultiplyNonTerminalExpression;
import Expressions.NumberTerminalExpression;
import Expressions.SumNonTerminalExpression;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Example 01
        Context context1 = new Context();
        context1.put("a",2);
        context1.put("b",3);

        AbstractExpression expression1 = new MultiplyNonTerminalExpression(new NumberTerminalExpression("a"),new NumberTerminalExpression("b"));
        System.out.println(expression1.interpret(context1));

        //Example 02
        Context context2 = new Context();
        context2.put("a",2);
        context2.put("b",4);
        context2.put("c",6);
        context2.put("d",8);

        AbstractExpression expression2 = new SumNonTerminalExpression(new MultiplyNonTerminalExpression(new NumberTerminalExpression("a"),new NumberTerminalExpression("b")),new MultiplyNonTerminalExpression(new NumberTerminalExpression("c"),new NumberTerminalExpression("d")));
        System.out.println(expression2.interpret(context2));

    }
}