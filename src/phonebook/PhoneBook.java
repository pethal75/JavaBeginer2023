package phonebook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    List<Contact> contacts;

    public void loadFromFile(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        contacts = new ArrayList<>();
        String line = null;

        while ((line = br.readLine()) != null) {
            String udaje[] = line.split(",");

            Contact contact = new Contact(udaje[0], udaje[1], udaje[2], udaje[3]);

            this.contacts.add(contact);
        }

        br.close();
        fr.close();
    }

    public void saveToFile(String fileName) {}

    public void addContact(Contact contact) {}

    public Contact searchContact(String name, String lastName) {
        return null;
    }

    public void printAllContacts() {
        for(Contact contact : this.contacts)
            System.out.println("Kontakt: "
                    + contact.getName() + " "
                    + contact.getLastName() + " "
                    + contact.getPhone() + " "
                    + contact.getEmail());
    }
}
