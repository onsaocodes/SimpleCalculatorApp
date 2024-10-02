import java.util.Scanner;

public class SimpleCalculatorApp {
    static Calculator cal = new Calculator();
    static Scanner scan = new Scanner(System.in);
    static int input1;
    static int input2;
    static char operation;

    public static void main(String[] args) {
        printCalculation();
    }

    public static void setUserInput1(){
        System.out.println("Insert first number");
        input1 = scan.nextInt();
    }

    public static int getUserInput1(){
        return input1;
    }

    public static void setOperation(){
        System.out.println("Choose operation: +, -, /, *");
        operation = scan.next().charAt(0);
    }

    public static char getOperation(){
        return operation;
    }

    public static void setUserInput2(){
        System.out.println("Insert second number");
        input2 = scan.nextInt();
    }

    public static int getUserInput2(){
        return input2;
    }

    public static void printCalculation(){
        setUserInput1();
        setOperation();
        setUserInput2();
        cal.calculate(getUserInput1(), getUserInput2(), getOperation());
    }
}
