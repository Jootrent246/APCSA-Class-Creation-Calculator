public class test {
    public static int valueOne = 5;
    public static int valueTwo = 10;

    public static void main(String args[]){

        System.out.println("Welcome to Calculator!\n");

        calculator tc = new calculator();
        int sum = tc.addition(valueOne, valueTwo);
        System.out.println(valueOne + " + " + valueTwo + " = " + sum);


    }






}
