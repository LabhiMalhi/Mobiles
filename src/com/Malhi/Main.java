package com.Malhi;

public class Main {

    public static void main(String[] args) {
        BaseMobile bm1 = new BaseMobile();
        BaseMobile bm2 = new Iphone();
	    BaseMobile bm3 = new Pixel1();
	    BaseMobile bm4 = new Pixel2();
	    BaseMobile bm5 = new Pixel3();
        System.out.println("Base Mobile => " + bm1.getPrice());
        System.out.println("Iphone => "+bm2.getPrice());
        System.out.println("Pixel 1 => "+bm3.getPrice());
        System.out.println("Pixel 2 => "+bm4.getPrice());
        System.out.println("Pixel 3 => "+bm5.getPrice());
    }
}
