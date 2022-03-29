package org.matthew.oopchallenge;

public class Patient {
    private String name;
    private int age;
    private Eye left_eye;
    private Eye right_eye;
    private Stomach stomach;
    private Heart heart;
    private Skin skin;

    public Patient(String name, int age, Eye left_eye, Eye right_eye, Heart heart, Stomach stomach, Skin skin) {
        this.name = name;
        this.age = age;
        this.left_eye = left_eye;
        this.right_eye = right_eye;
        this.stomach = stomach;
        this.heart = heart;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Eye getLeft_eye() {
        return left_eye;
    }

    public void setLeft_eye(Eye left_eye) {
        this.left_eye = left_eye;
    }

    public Eye getRight_eye() {
        return right_eye;
    }

    public void setRight_eye(Eye right_eye) {
        this.right_eye = right_eye;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public void setStomach(Stomach stomach) {
        this.stomach = stomach;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }
}
