package chap04_bean.com.common;

import java.util.Date;

public class Bread extends Product{

    private java.util.Date bakedDate;

    public Bread() {
        super();
    }

    public Bread(String name, int price, Date bakedDate) {
        super(name, price);
        this.bakedDate = bakedDate;
    }

    public Date getBakedDate() {
        return bakedDate;
    }

    public void setBakedDate(Date bakedDate) {
        this.bakedDate = bakedDate;
    }


//    @Override
//    public String toString() {
//        return super.toString() + " " + this.bakedDate;
//    }


    @Override
    public String toString() {
        return super.toString() + " " + this.bakedDate;
    }
}
