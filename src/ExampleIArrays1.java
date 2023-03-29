public class ExampleIArrays1 {

    public static void main(String[] args) {
        int screen[][][] = new int[10][5][5];

        screen[1][0][2] = 1;
        screen[1][1][1] = 1;
        screen[1][1][2] = 1;
        screen[1][2][2] = 1;
        screen[1][3][2] = 1;
        screen[1][4][1] = 1;
        screen[1][4][2] = 1;
        screen[1][4][3] = 1;

        screen[2][0][1] = 1;
        screen[2][0][2] = 1;
        screen[2][0][3] = 1;
        screen[2][1][0] = 1;
        screen[2][1][4] = 1;
        screen[2][2][3] = 1;
        screen[2][3][2] = 1;
        screen[2][4][1] = 1;
        screen[2][4][2] = 1;
        screen[2][4][3] = 1;
        screen[2][4][4] = 1;

        int n = 121;

        for (int y = 0; y < 5; y++) {
            int n1 = n;

            while (n1 > 0) {
                int m = n1 % 10;

                for (int x = 0; x < 5; x++) {
                    System.out.print(screen[m][y][x] == 1 ? 'X' : ' ');
                }

                System.out.print(' ');
                n1 = n1 / 10;
            }
        }
    }
}
