public class calculator {

    public static <T extends Number> double add(T x, T y) {
        return x.doubleValue() + y.doubleValue();
    }

    public static <T extends Number> double sub(T x, T y) {
        return x.doubleValue() - y.doubleValue();
    }

    public static <T extends Number> double mult(T x, T y) {
        return x.doubleValue() * y.doubleValue();
    }

    public static <T extends Number> double div(T x, T y) {
        return x.doubleValue() / y.doubleValue();
    }
}