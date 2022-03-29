package org.matthew.oopchallenge;

public class Heart extends Organ{
    private int heart_rate;

    public Heart(String condition, int heart_rate) {
        super(condition);
        this.setName("Heart");
        this.heart_rate = heart_rate;
    }

    public int getHeart_rate() {
        return heart_rate;
    }

    public void setHeart_rate(int heart_rate) {
        this.heart_rate = heart_rate;
    }
}
