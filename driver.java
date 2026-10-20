import java.util.Scanner;


public class driver{
    public static void main(String[] args){
        calculator calculator = new calculator();
        Scanner input = new Scanner(System.in);
        String dataType = input.next();
        String operator = input.next();


    if (dataType.equals("double")) {

    double value1 = input.nextDouble(); // your scanner object must be named input to avoid a mismatch or change the input object name to match your scanner object name
    double value2 = input.nextDouble();
    double result;

    if (operator.equals("+"))
        result = calculator.add(value1, value2);
    else if (operator.equals("-"))
        result = calculator.sub(value1, value2);
    else if (operator.equals("*"))
        result = calculator.mult(value1, value2);
    else if (operator.equals("/"))
        result = calculator.div(value1, value2);
    else {
        System.err.println("Invalid operator.");
        return;
    }
    // Add your result printing statement here
}

// Code block that deals with integers
else if (dataType.equals("integer")) {

    int value1 = input.nextInt();
    int value2 = input.nextInt();
    int result;

    if (operator.equals("+"))
        result = calculator.add(value1, value2);
    else if (operator.equals("-"))
        result = calculator.sub(value1, value2);
    else if (operator.equals("*"))
        result = calculator.mult(value1, value2);
    else if (operator.equals("/"))
        result = calculator.div(value1, value2);
    else {
        System.err.println("Invalid operator.");
        return;
    }
    // Add your result printing statement here
} 

// Code block to deal with a non-valid data type input
else {
    System.err.println("Data type incompatible - exiting program.");
}
        

        
    }
}