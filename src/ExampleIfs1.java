public class ExampleIfs1 {

    public static void main(String[] args) {
        int vek = 25;
        char pohlavie = 'Z';
        String vysledok;

        if (vek < 18 && pohlavie == 'M')
        {
            vysledok = "chlapec";
            System.out.println(vysledok);
        }
        else if (vek < 18 && pohlavie == 'Z')
        {
            vysledok = "dievca";
            System.out.println(vysledok);
        }
        else if (vek >= 18 && pohlavie == 'M')
        {
            vysledok = "muz";
            System.out.println(vysledok);
        }
        else if (vek >= 18 && pohlavie == 'Z')
        {
            vysledok = "zena";
            System.out.println(vysledok);
        }
    }
}
