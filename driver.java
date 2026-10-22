import java.util.Scanner;


public class driver{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Calculator!");
        System.out.println("Enter a data type, operator, and the values: ");
        System.out.println("Example: integer + 5 3");

        String dataType = input.next();
        String operator = input.next();

        Number value1;
        Number value2;
        Number result;

        if (dataType.equals("integer")) {
            value1 = input.nextInt();
            value2 = input.nextInt();
        } else {
            value1 = input.nextDouble();
            value2 = input.nextDouble();
        }

        if (operator.equals("+")) {
            result = calculator.add(value1, value2);
        } 
        else if (operator.equals("-")) {
            result = calculator.sub(value1, value2);
        } 
        else if (operator.equals("*")) {
            result = calculator.mult(value1, value2);
        } 
        else if (operator.equals("/")) {
            result = calculator.div(value1, value2);
        } 
        else {
            System.err.println("Invalid operator.");
            input.close();
            return;
        }
    
        if (value1 instanceof Integer && value2 instanceof Integer) {
            System.out.println(value1 + " " + operator + " " + value2 + " = " + result.intValue());
        } 
        else {
            System.out.println(value1 + " " + operator + " " + value2 + " = " + result.doubleValue());
        }

        input.close();
    }
}


    
