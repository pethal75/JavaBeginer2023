package examples;

public class ExampleMultiplications {

    public static void main(String[] args) {

        int n1 = 3, n2 = 5;

        for(; n1 <= n2; n1++) {

            for(int m = 1; m <= 10; m++)
                System.out.print(n1 + "*" + m + "=" + (n1*m) + "   ");

            System.out.println();
        }
    }
}

