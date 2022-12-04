package MainAndCalculatorClass;

import java.util.Scanner;
public class CalculatorClass {

    static int number1;
    static int number2;
    static String var;

    public static void input(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Number (1): ");
        number1 = scan.nextInt();
        System.out.print("Input Number (2): ");
        number2 = scan.nextInt();

        System.out.println("Pick Operator: ");
        String input = scan.nextLine();
        operator(input);
    }

    public static void operator(String var){
        if (var.equals("+")){
            additionMethod();
        }
        else if (var.equals("-")){
            subtractionMethod();
        }
        else if (var.equals("/")){
            multiplicationMethod();
        }
        else if (var.equals("*")){
            divisionMethod();
        }else{
            System.out.println("Error");
        }
    }

    public static void additionMethod(){
        int total = number1 + number2;
        System.out.println("Total: " + total + "Operator: (" + var + ")");
    }
    public static void subtractionMethod(){
        int total = number1 - number2;
        System.out.println("Total: " + total + "Operator: (" + var + ")");
    }
    public static void multiplicationMethod(){
        int total = number1 * number2;
        System.out.println("Total: " + total + "Operator: (" + var + ")");
    }
    public static void divisionMethod(){
        int total = number1 / number2;
        System.out.println("Total: " + total + "Operator: (" + var + ")");
    }
}
