package com.challenges.display;

public class Display {
    private int width;
    private int height;
    private float ppi;
    private String model;

    public Display(int width, int height, float ppi, String model) {
        this.width = width;
        this.height = height;
        this.ppi = ppi;
        this.model = model;
    }

    public void compareSize(Display m) {
        // Checks each attribute individually
        if (this.width > m.width) {
            System.out.print(this.model + " is longer and ");
        } else if (this.width < m.width) {
            System.out.print(this.model + " is narrower and ");
        } else {
            System.out.print(this.model + " is the same width and ");
        }

        if (this.height > m.height) {
            System.out.println("taller than " + m.model);
        } else if (this.height < m.height) {
            System.out.println("shorter than " + m.model);
        } else {
            System.out.println("the same height as " + m.model);
        }
    }

    public void compareSharpness(Display m) {
        // Check ppi attribute
        if (this.ppi > m.ppi) {
            System.out.println(this.model + " is sharper than " + m.model);
            return;
        }

        if (this.ppi < m.ppi) {
            System.out.println(this.model + " is less sharp than " + m.model);
            return;
        }

        System.out.println(this.model + " has the same shrapness as" + m.model);
    }

    public void compareWithMonitor(Display m) {
        // Checks each attribute individually
        if (this.width > m.width) {
            System.out.print(this.model + " is longer,  ");
        } else if (this.width < m.width) {
            System.out.print(this.model + " is narrower, ");
        } else {
            System.out.print(this.model + " is the same width, ");
        }

        if (this.ppi > m.ppi) {
            System.out.print("sharper");
        } else if (this.ppi < m.ppi) {
            System.out.print("less sharp");
        } else {
            System.out.print("same sharpness");
        }

        if (this.height > m.height) {
            System.out.println(" and taller than " + m.model);
        } else if (this.height < m.height) {
            System.out.println(" and shorter than " + m.model);
        } else {
            System.out.println(" and the same height as " + m.model);
        }
    }

}
