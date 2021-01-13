package ArrayListChallengePart2_11;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already in file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0) {
            System.out.println(oldContact + " was not found");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact + " was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int findPostion = findContact(contact);
        if(findPostion < 0) {
            System.out.println(contact.getName() + ", was not found");
            return false;
        }
        this.myContacts.remove(findPostion);
        System.out.println(contact.getName() + ", was delete");
        return true;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for(int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i); //_______________________________________________________________________________________
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        else
            return null;
    }

    public void printContact() {
        System.out.println("Contact List");
        for(int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i+1) + "." + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }
}
