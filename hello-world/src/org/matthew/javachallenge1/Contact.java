package org.matthew.javachallenge1;

import java.util.ArrayList;

public class Contact {
    private String name;
    private String phone_no;
    private String notes;
    private ArrayList<Message> messages;

    public Contact(String name, String phone_no, String notes) {
        this.name = name;
        this.phone_no = phone_no;
        this.notes = notes;
        this.messages = new ArrayList<>();
    }
    public void getDetails(){
        System.out.println("Name: " + this.getName() + "\nPhone Number: " + this.getPhone_no() + "\nNotes:" + this.getNotes()+"\n");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
}
