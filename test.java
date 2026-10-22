public class test {
    public static Number valueOne = 5;
    public static Number valueTwo = 10;

    public static void main(String args[]){

        System.out.println("Welcome to Calculator!\n");

        double sum = calculator.add(valueOne, valueTwo);
        if (valueOne instanceof Integer && valueTwo instanceof Integer){
             System.out.println(valueOne + " + " + valueTwo + " = " + (int) sum);
        }
        else {
            System.out.println(valueOne + " + " + valueTwo + " = " + sum);
        }
        double diff = calculator.sub(valueOne, valueTwo);
        if (valueOne instanceof Integer && valueTwo instanceof Integer){
             System.out.println(valueOne + " - " + valueTwo + " = " + (int) diff);
        }
        else {
            System.out.println(valueOne + " - " + valueTwo + " = " + diff);
        }

        double pro = calculator.mult(valueOne, valueTwo);
        if (valueOne instanceof Integer && valueTwo instanceof Integer){
             System.out.println(valueOne + " * " + valueTwo + " = " + (int) pro);
        }
        else {
            System.out.println(valueOne + " * " + valueTwo + " = " + pro);
        }

        double quo = calculator.div(valueOne, valueTwo);
        if (valueOne instanceof Integer && valueTwo instanceof Integer){
             System.out.println(valueOne + " / " + valueTwo + " = " + (int) quo);
        }
        else {
            System.out.println(valueOne + " / " + valueTwo + " = " + quo);
        }

    }

}
