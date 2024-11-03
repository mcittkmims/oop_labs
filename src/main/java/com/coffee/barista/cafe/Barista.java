package com.coffee.barista.cafe;

import java.util.ArrayList;
import java.util.List;

import com.coffee.enums.Intensity;
import com.coffee.enums.SyrupType;

public class Barista {
    private List<Coffee> orders;

    public Barista() {
        this.orders = new ArrayList<>();
    }

    public void makeOrders(String noteOfOrders) {
        String[] orders = noteOfOrders.split(",");
        int i = 0;
        while (i < orders.length) {
            if (orders[i].equals("CAPPUCCINO")) {
                i++;
                Intensity intensity = Intensity.valueOf(orders[i]);
                i++;
                int mlOfMilk = Integer.valueOf(orders[i]);
                this.orders.add(new Cappuccino(intensity, mlOfMilk).makeCappuccino());
                System.out.println();
            } else if (orders[i].equals("AMERICANO")) {
                i++;
                Intensity intensity = Intensity.valueOf(orders[i]);
                i++;
                int mlOfWater = Integer.valueOf(orders[i]);
                this.orders.add(new Americano(intensity, mlOfWater).makeAmericano());
                System.out.println();
            } else if (orders[i].equals("PUMPKINSPICELATTE")) {
                i++;
                Intensity intensity = Intensity.valueOf(orders[i]);
                i++;
                int mlOfMilk = Integer.valueOf(orders[i]);
                i++;
                int mgOfPumpkinSpice = Integer.valueOf(orders[i]);
                this.orders.add(new PumpkinSpiceLatte(intensity, mlOfMilk, mgOfPumpkinSpice).makePumpkinSpiceLatte());
            } else if (orders[i].equals("SYRUPCAPPUCCINO")) {
                i++;
                Intensity intensity = Intensity.valueOf(orders[i]);
                i++;
                int mlOfMilk = Integer.valueOf(orders[i]);
                i++;
                SyrupType syrup = SyrupType.valueOf(orders[i]);
                this.orders.add(new SyrupCappuccino(intensity, mlOfMilk, syrup).makeSyrupCappuccino());
            }
            i++;
        }

    }

    public void showAllOrdersDetailes() {
        for (Coffee coffee : orders) {
            coffee.printDetails();
            System.out.println();
        }
    }
}
