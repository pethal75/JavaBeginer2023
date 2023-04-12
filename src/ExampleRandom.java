public class ExampleRandom {

    public static void main(String[] args) {
        int cisla[] = new int[10];

        for(int i = 0; i < 10; i++) {
            cisla[i] = (int)(Math.random() * 100);
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(i + ".pozicia je cislo " + cisla[i]);
        }
    }
}
