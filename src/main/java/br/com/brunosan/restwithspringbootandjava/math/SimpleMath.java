package br.com.brunosan.restwithspringbootandjava.math;

public class SimpleMath {
    
    public static Double sumNumbers(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }
    
    public static Double subtraction(Double numberOne, Double numberTwo) {
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
    
    public static Double squareRoot(Double number) {
        return Math.sqrt(number);
    }
}
