package xyz.cruxlab.converter;

public class Conv {
    // this method will convert all number to string

    public static String s_get(int number) {
        return Integer.toString(number);
    }

    public static String s_get(float number) {
        return Float.toString(number);
    }

    public static String s_get(double number) {
        return Double.toString(number);
    }

    public static String s_get(long number) {
        return Long.toString(number);
    }

}
