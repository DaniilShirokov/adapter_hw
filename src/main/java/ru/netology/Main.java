package ru.netology;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(10)
                        .addOperand(22)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );

        Ints intsCalc = new IntsCalculator();
        System.out.println("sum = " + intsCalc.sum(2, 6));
        System.out.println("mult = " + intsCalc.mult(10, 22));
        System.out.println(intsCalc.pow(2, 10));
    }
}