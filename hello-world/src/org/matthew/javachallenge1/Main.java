package org.matthew.javachallenge1;

import org.matthew.collections.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Contact> contacts;
    private static Scanner scanner;
    public static void main(String[] args) {
        boolean quit_loop = false;
        contacts = new ArrayList<>();
        scanner = new Scanner(System.in);

        //testing classes
        contacts.add(new Contact("matthew","6475446922","me"));
        for (Contact c: contacts){
            if (c.getName().equals("matthew")){
                ArrayList<Message> message = new ArrayList<>();
                message.add(new Message("Hello world",1));
                message.add(new Message("Oi",2));
                c.setMessages(message);
            }
        }

        initialMenu();
        }

    private static void initialMenu() {
        System.out.println("Welcome to your contacts and messages\n\t1. Manage contacts\n\t2. Messages\n\t3. Quit");
        int user_choice = scanner.nextInt();
        switch (user_choice) {
            case 1:
                manageContacts();
                break;
            case 2:
                manageMessages();
                break;
            default:
                System.out.println("See you!");
                break;
        }
    }

    private static void manageContacts() {
        System.out.println("1. Show all contacts\n2. Add new contact\n3. Search for a contact\n4. Delete a contact\n5. Go back to previous menu");
        int user_choice = scanner.nextInt();
        switch (user_choice) {
            case 1:
                showAllContacts();
                manageContacts();
                break;
            case 2:
                addNewContact();
                manageContacts();
                break;
            case 3:
                searchForContact();
                manageContacts();
                break;
            case 4:
                deleteContact();
                manageContacts();
            default:
                initialMenu();
                break;
        }
    }

    private static void manageMessages() {
        System.out.println("1. See the list of all messages\n2. Send a new message\n3. Go back to previous menu");
        int user_choice = scanner.nextInt();
        switch (user_choice) {
            case 1:
                checkMessage();
                manageMessages();
                break;
            case 2:
                sendMessage();
                manageMessages();
                break;
            default:
                initialMenu();
                break;
        }
    }



    private static void showAllContacts() {
        for (Contact i: contacts){
            i.getDetails();
        }
    }
    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.next();
        System.out.println("Enter new phone number: ");
        String phone = scanner.next();
        System.out.println("Enter new notes: ");
        String notes = scanner.next();
        if (name.equals("") || phone.equals("") || notes.equals("")){
            System.out.println("Please enter all info");
            addNewContact();
        }else{
            for (Contact i: contacts){
                if (name.equals(i.getName())){
                    System.out.println("This contact already exists in database, please try again");
                    manageContacts();
                }
            }
            System.out.println("Added new contact");
            contacts.add(new Contact(name,phone,notes));
        }

    }
    private static void searchForContact() {
        System.out.println("Enter contact name to search");
        String name = scanner.next();
        if (name.equals("")){
            System.out.println("Enter a name");
            searchForContact();
        }else{
            boolean doesExist = false;
            for (Contact i: contacts){
                if (i.getName().equals(name)){
                    doesExist = true;
                    i.getDetails();
                }
            }
            if (!doesExist){
                System.out.println("This contact doesn't exist");
            }
        }
    }
    private static void deleteContact() {
        System.out.println("Enter contact name to delete");
        String name = scanner.next();
        if (name.equals("")){
            System.out.println("Enter a name");
            deleteContact();
        }else {
            boolean doesExist = false;
            Contact needsToRemove = null;
            for (Contact i: contacts){
                if (i.getName().equals(name)){
                    doesExist = true;
                    needsToRemove = i;
                }

            }
            if (doesExist){
                contacts.remove(needsToRemove);
                System.out.println("This contact is deleted");
            }else{
                System.out.println("This contact doesn't exist");
            }
        }
    }
    private static void checkMessage() {
        for (Contact i: contacts){
            for(Message m: i.getMessages()){
                System.out.println("Name:" + i.getName());
                System.out.println("ID: "+m.getId() + "\nMessage: "+m.getMessage());
            }

        }
    }
    private static void sendMessage() {
        System.out.println("Choose a recipient");
        String name = scanner.next();
        boolean doesExist = false;
        Contact recipient = null;
        for (Contact i : contacts) {
            if (i.getName().equals(name)) {
                recipient = i;
                doesExist = true;
            }
            if (doesExist) {
                System.out.println("Enter your message");
                String message = scanner.next();
                System.out.println(message + " sent to " + recipient.getName() + " " + recipient.getPhone_no());
            } else {
                System.out.println("Recipient doesn't exist");
            }

        }
    }
}