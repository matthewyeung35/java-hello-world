package org.matthew.oopchallenge;

public class Organ {
    private String name;
    private String condition;

    public Organ(String condition) {
        this.condition = condition;
    }
    public void getDetails(){
        System.out.println("Name: " + this.getName());
        System.out.println("Condition: " + this.getCondition());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
}
