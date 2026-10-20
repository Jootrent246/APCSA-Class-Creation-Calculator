public class test {
    public static double valueOne = 5;
    public static double valueTwo = 10;

    public static void main(String args[]){

        System.out.println("Welcome to Calculator!\n");

        calculator tc = new calculator();
        double sum = tc.add(valueOne, valueTwo);
        System.out.println(valueOne + " + " + valueTwo + " = " + sum);

        double diff = tc.sub(valueOne, valueTwo);
        System.out.println(valueOne + " - " + valueTwo + " = " + diff);

        double pro = tc.mult(valueOne, valueTwo);
        System.out.println(valueOne + " * " + valueTwo + " = " + pro);

        double quo = tc.div(valueOne, valueTwo);
        System.out.println(valueOne + " / " + valueTwo + " = " + quo);

    }

}
