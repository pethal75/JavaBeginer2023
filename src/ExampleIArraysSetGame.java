import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExampleIArraysSetGame {

    public static void main(String[] args) {
        Set<Integer> mnozina = new HashSet<>();

        for(int i = 0; i < 5; i++)
            mnozina.add((int)(Math.random()*10));

        System.out.println("Hadaj cislo:");
        Scanner scanner = new Scanner(System.in);
        int vstup = scanner.nextInt();

        if (mnozina.contains(vstup))
            System.out.println("Uhadol :-)");
        else
            System.out.println("Neuhadol :-(");

        System.out.println("Cisla boli: " + mnozina);
    }
}
