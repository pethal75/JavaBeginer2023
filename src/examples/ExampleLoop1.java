package examples;

public class ExampleLoop1 {

    public static void main(String[] args) {

        int square = 7;


        for(int line = 1; line <= square; line++) {

            // Vypis riadku
            for (int col = 1; col <= square; col++) {

                if (line == 1 || line == square || col == 1 || col == square || col == line)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            if (line == square / 2) break;

            // Prechod na novy riadok
            System.out.println();
        }
    }
}

