package com.coffee.behavior2;

import com.coffee.enums.*;
public class Main {
    public static void main(String[] args) {
        SyrupCappuccino syrupCappuccino = new SyrupCappuccino(Intensity.NORMAL, 50, SyrupType.CARAMEL).makeSyrupCappuccino();
        Cappuccino cappuccino = new Cappuccino(Intensity.LIGHT, 20).makeCappuccino();
        Americano americano = new Americano(Intensity.STRONG, 100).makeAmericano();
        syrupCappuccino.printDetails();
        cappuccino.printDetails();
        americano.printDetails();
    }
}
