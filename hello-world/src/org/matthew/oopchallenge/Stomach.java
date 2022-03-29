package org.matthew.oopchallenge;

public class Stomach extends Organ{
    public Stomach(String condition) {
        super(condition);
        this.setName("Stomach");
    }
    public void feed(){
        System.out.println("Digseting begin...");
    }
}
