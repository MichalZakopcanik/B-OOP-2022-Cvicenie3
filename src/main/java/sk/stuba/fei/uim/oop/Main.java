package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.Auto;

public class Main {
    public static void main(String[] args) {
        Auto skoda = new Auto();

        skoda.setStavNadrze(50);


        skoda.jazdi(100);
        System.out.println(skoda.getStavNadrze());

        skoda.jazdi(200);
        System.out.println(skoda.getStavNadrze());
    }
}
