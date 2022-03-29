package org.matthew.oopchallenge;

public class Eye extends Organ{
    private String color;
    private boolean closed;
    private char position;

    public void open_close(){
        if (this.closed){
            this.closed = false;
        }else{
            this.closed = true;
        }
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: " + this.getColor());
    }

    public Eye(String condition, String color, Boolean closed, char position) {
        super(condition);
        this.color = color;
        this.closed = closed;
        if (position == 'l'){
            this.setName("Left eye");
        }else if (position == 'r'){
            this.setName("Right eye");
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public char getPosition() {
        return position;
    }

    public void setPosition(char position) {
        this.position = position;
    }
}
