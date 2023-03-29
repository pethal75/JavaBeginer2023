public class ExamplePrimeNumbers {

    public static void main(String[] args) {

        int n1 = 10, n2 = 100;

        for(int n = n1; n <= n2; n++) {

            boolean prvocislo = true;

            for(int m = 2; m < n; m++) {
                if (n % m == 0)
                    prvocislo = false;
            }

            if (prvocislo == true)
                System.out.println("Cislo " + n + " je prvocislo.");
        }
    }
}

