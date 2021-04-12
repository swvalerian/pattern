package main.java.com.swvalerian.basepatterns.behavioral.interpreter;

import java.util.Objects;

public class ClientInterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpresion();
        Expression isJavaEE = getJavaEEExpression();

        System.out.println(isJava.interpret("Java"));
        System.out.println(isJavaEE.interpret("Spring"));
    }

    public static Expression getJavaExpresion() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");
        return new OrExpression(java, javaCore);
    }
    public static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");
        return new AndExpression(java, spring);
    }
}
