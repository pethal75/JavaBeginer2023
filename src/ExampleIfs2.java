public class ExampleIfs2 {

    public static void main(String[] args) {
        int vek = 25;
        char pohlavie = 'Z';
        String vysledok;

        if (vek < 18)
        {
            if (pohlavie == 'M') {
                vysledok = "chlapec";
            } else {
                vysledok = "dievca";
            }
        }
        else
        {
            if (pohlavie == 'M') {
                vysledok = "muz";
            } else {
                vysledok = "zena";
            }
        }

        System.out.println(vysledok);
    }
}
