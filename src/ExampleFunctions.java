public class ExampleFunctions {

    public static int sumInt(int a, int b) {
        return a + b;
    }

    public static int sumString(String aString, String bString) {
        // Convert strings to integers
        int aInt = Integer.parseInt(aString);
        int bInt = Integer.parseInt(bString);

        // Calculate sum
        return sumInt(aInt, bInt);
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static long faktorial(long a) {
        if (a == 1)
            return 1;

        return a * faktorial(a - 1);
    }

    public static int randomNumber(int min, int max) {
        return (int)(Math.random() * (max - min) + min);
    }

    public static void main(String[] args) {
        System.out.println(faktorial(6));

        System.out.println(sumInt(10, 20));

        System.out.println(sumString("10", "20"));
    }
}
