package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.auto.Auto;
import sk.stuba.fei.uim.oop.auto.Vozidlo;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;
import sk.stuba.fei.uim.oop.utility.KeyboardInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int vek = ZKlavesnice.readInt("Zadajte vek:");
        System.out.println("vek zklavesnice:" + vek);

        System.out.println("----------------------------");

        vek = KeyboardInput.readInt("Zadajte vek:",2);
        System.out.println("vek keyboardinput:" + vek);

        System.out.println("----------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadajte vek:");
        vek = scanner.nextInt();

        System.out.println("vek scanner:" + vek);

    }

}
