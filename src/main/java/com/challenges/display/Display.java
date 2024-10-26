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
        // If both width and height are equal, the models have the same size
        if (this.width == m.width && this.height == m.height) {
            System.out.println(this.model + " has the same size as " + m.model);
            return;
        }
        // If both width and height are bigger, the model is bigger
        if (this.width > m.width && this.height > m.height) {
            System.out.println(this.model + " is bigger than " + m.model);
            return;
        }
        // If both width and height are smaller, the model is smaller
        if (this.width < m.width && this.height < m.height) {
            System.out.println(this.model + " is smaller than " + m.model);
            return;
        }

        // Checks each attribute individually
        if (this.width > m.width) {
            System.out.print(this.model + " is longer and ");
        } else if (this.width > m.width) {
            System.out.print(this.model + " is narrower and ");
        } else {
            System.out.print(this.model + " is the same width and ");
        }

        if (this.height > m.height) {
            System.out.println(" taller than " + m.model);
        } else if (this.height > m.height) {
            System.out.println(" the same height as " + m.model);
        } else {
            System.out.println(" shorter than " + m.model);
        }
    }

    public void compareSharpness(Display m) {
        if (this.ppi > m.ppi) {
            System.out.println(this.model + " is sharper than " + m.model);
            return;
        }

        if (this.ppi > m.ppi) {
            System.out.println(this.model + " is less sharp than " + m.model);
            return;
        }

        System.out.println(this.model + " has the same shrapness " + m.model);
    }

    public void compareWithMonitor(Display m) {

    }

}
