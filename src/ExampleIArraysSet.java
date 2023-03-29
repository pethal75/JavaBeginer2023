import java.util.HashSet;
import java.util.Set;

public class ExampleIArraysSet {

    public static void main(String[] args) {
        Set<Integer> mnozina = new HashSet<>();

        mnozina.add(3);
        mnozina.add(5);
        mnozina.add(10);
        mnozina.add(3);

        int priemer = 0;

        for(Integer cislo : mnozina) {
            priemer += cislo;
        }

        priemer /= mnozina.size();

        System.out.println(priemer);
    }
}
