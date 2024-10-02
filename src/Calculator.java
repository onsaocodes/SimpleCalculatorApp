import java.util.Scanner;

public class Calculator {

    public int addition (int input1, int input2){
        return input1 + input2;
    }

    public int subtraction (int input1, int input2){
        return input1 - input2;
    }

    public int divide (int input1, int input2){
        return input1 / input2;
    }

    public int multiply (int input1, int input2){
        return input1 * input2;
    }

    public void calculate(int input1, int input2, char operation){
        switch (operation){
            case '+':
                System.out.println(input1 + " + " + input2 + " = " + addition(input1, input2));
                break;
            case '-':
                System.out.println(input1 + " - " + input2 + " = " + subtraction(input1, input2));
                break;
            case '/':
                System.out.println(input1 + " / " + input2 + " = " + divide(input1, input2));
                break;
            case '*':
                System.out.println(input1 + " * " + input2 + " = " + multiply(input1, input2));
                break;
            default:
                System.out.println("Incorrect operation");
                break;
        }
    }



}
