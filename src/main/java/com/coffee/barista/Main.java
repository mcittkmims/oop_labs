package com.coffee.barista;

import com.coffee.barista.cafe.*;
import com.coffee.enums.Intensity;
import com.coffee.enums.SyrupType;

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
