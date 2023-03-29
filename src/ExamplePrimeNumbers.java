public class ExamplePrimeNumbers {

    public static void main(String[] args) {

        int n1 = 10, n2 = 100;

        for(; n1 <= n2; n1++) {

            boolean prvocislo = true;

            for(int m = 2; m < n1; m++) {
                if (n1 % m == 0) prvocislo = false;
            }

            if (prvocislo)
                System.out.println("Cislo " + n1 + " je prvocislo.");
        }
    }
}

