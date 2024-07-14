package br.com.morato.math;

public class SimpleMath {
    public static Double sum(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }
    
    public static Double substraction(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }
    
    public static Double multiplication(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }

    public static Double division(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }

    public static Double mean(Double numberOne, Double numberTwo) {
        return (numberOne + numberTwo) / 2;
    }

    public static Double square(Double numberOne) {
        return Math.sqrt(numberOne);
    }
}
