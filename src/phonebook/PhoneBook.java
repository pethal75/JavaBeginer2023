package phonebook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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

    public void saveToFile(String fileName) throws IOException {
        File file = new File(fileName);
        FileWriter fw = new FileWriter(file);

        for(Contact contact : this.contacts)
            fw.write( contact.getName() + ","
                    + contact.getLastName() + ","
                    + contact.getPhone() + ","
                    + contact.getEmail() + "\n");

        fw.close();
    }

    public void addContact(Contact contact) {
        if (this.searchContactByName(contact.getName(), contact.getLastName()).isEmpty())
            this.contacts.add(contact);
    }

    public List<Contact> searchContactByName(String name, String lastName) {

        List<Contact> najdeneKontakty = new ArrayList<>();

        for(Contact contact: this.contacts)
            if (contact.getName().toLowerCase().equals(name.toLowerCase())
                    && contact.getLastName().toLowerCase().equals(lastName.toLowerCase()))
                najdeneKontakty.add(contact);

        return najdeneKontakty;
    }

    public List<Contact> searchContactByPhone(String phone) {

        List<Contact> najdeneKontakty = new ArrayList<>();

        for(Contact contact: this.contacts)
            if (contact.getPhone().contains(phone))
                najdeneKontakty.add(contact);

        return najdeneKontakty;
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
