package demo.calculator;

public class Calculator {

    public Calculator(){}

    public int addition (int a, int b){
        return a+b;
    }

    public int subtraction (int a, int b) { return a-b;}

    public boolean isPositive (int a) {return a >= 0;}

    public boolean isNegative (int a) {return a < 0;}
}