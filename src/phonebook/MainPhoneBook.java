package phonebook;

import java.io.IOException;

public class MainPhoneBook {
    public static void main(String[] args) throws IOException {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.loadFromFile("data\\kontakty.txt");
        phoneBook.printAllContacts();

        // TODO Menu 1 - print contacts, 2 add contact, 3 search contact
    }
}
