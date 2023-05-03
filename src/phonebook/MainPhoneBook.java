package phonebook;

import java.io.IOException;
import java.util.Scanner;

public class MainPhoneBook {
    public static void main(String[] args) throws IOException {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.loadFromFile("data\\kontakty.txt");

        // TODO Menu 1 - print contacts, 2 add contact, 3 search contact, 4 exit
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (exit == false) {
            System.out.println("1.Vypisat");
            System.out.println("2.pridat kontakt");
            System.out.println("3.hladat kontakt");
            System.out.println("4.koniec");

            String volba = scanner.next();

            if (volba.equals("1"))
                phoneBook.printAllContacts();

            if (volba.equals("4"))
                exit = true;
        }
    }
}
