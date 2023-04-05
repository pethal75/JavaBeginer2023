package examples;

public class HomeworkMethods {

    public static void main(String[] args) {
        int []array = {10, 43, 46, 1, 8, 11};

        boolean found = find(array, 11);

        System.out.println("Cislo sa naslo " + found);
    }

    private static boolean find(int[] array, int i) {
        for(int index = 0; index < array.length; index++) {
            if (array[index] == i)
                return true;
        }

        return false;
    }
}
