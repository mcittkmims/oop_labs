package com.coffee.behavior1;

import com.coffee.enums.*;
public class Main {
    public static void main(String[] args) {
        SyrupCappuccino syrupCappuccino = new SyrupCappuccino(Intensity.NORMAL, 50, SyrupType.CARAMEL);
        Cappuccino cappuccino = new Cappuccino(Intensity.LIGHT, 20);
        Americano americano = new Americano(Intensity.STRONG, 100);
        syrupCappuccino.printDetails();
        cappuccino.printDetails();
        americano.printDetails();
    }
}