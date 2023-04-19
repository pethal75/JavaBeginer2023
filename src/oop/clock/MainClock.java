package oop.clock;

public class MainClock {
    public static void main(String[] args) {
        Clock hodiny1 = new Clock(13,40,20);
        Clock hodiny2 = new Clock(13,20,50);

        hodiny1.addClock(hodiny2);

        System.out.println(hodiny1);
        System.out.println(hodiny2);
    }
}
