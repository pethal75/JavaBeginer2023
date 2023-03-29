import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ExampleStrings {

    public static void main(String[] args) {
        String meno = "John" + " Surname";

        List<String> mena = List.of("John", "George");

        meno = meno.replace("John", "Peter");

        System.out.println(meno);
    }
}
