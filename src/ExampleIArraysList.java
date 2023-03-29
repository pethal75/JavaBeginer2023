import java.util.ArrayList;

public class ExampleIArraysList {

    public static void main(String[] args) {
        ArrayList<Double> zoznam = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            zoznam.add(Math.random() * 100);
        }

        double priemer = 0;

        for (int i =0; i < zoznam.size(); i++)
            priemer = priemer + zoznam.get(i);

        priemer = priemer / zoznam.size();

        System.out.println(priemer);

        System.out.println(zoznam);
    }
}
