package com.ds.Test;

public class Sample extends  Bike{
    int speedlimit=150;
    public static void main(String args[]) throws CloneNotSupportedException {
        Bike obj=new Bike();
        System.out.println(obj.speedlimit);
        Bike o2 = (Bike)obj.clone();
        System.out.println(o2.speedlimit);

    }
}


class Bike implements Cloneable{
    int speedlimit=90;
    Bike() {

    }
    Bike(int speedlimit) {
        this.speedlimit = speedlimit;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        speedlimit = 100;
        return new Bike(speedlimit);
    }
}

