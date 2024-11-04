package com.coffee.behavior2;

import com.coffee.enums.*;
public class Main {
    public static void main(String[] args) {
        Coffee syrupCappuccino = new SyrupCappuccino(Intensity.NORMAL, 50, SyrupType.CARAMEL).makeSyrupCappuccino();
        Coffee cappuccino = new Cappuccino(Intensity.LIGHT, 20).makeCappuccino();
        Coffee americano = new Americano(Intensity.STRONG, 100).makeAmericano();
        System.out.println();
        ((SyrupCappuccino) syrupCappuccino).printDetails();
        System.out.println();
        ((Cappuccino) cappuccino).printDetails();
        System.out.println();
        ((Americano) americano).printDetails();
    }
}
