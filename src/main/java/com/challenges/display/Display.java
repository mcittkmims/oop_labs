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
            System.out.print("taller than " + m.model);
        } else if (this.height < m.height) {
            System.out.print("shorter than " + m.model);
        } else {
            System.out.print("the same height as " + m.model);
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

        System.out.println(this.model + " has the same shrapness as " + m.model);
    }

    public void compareWithMonitor(Display m) {
        // Combining the previous methods
        this.compareSize(m);
        System.out.print(" and ");
        this.compareSharpness(m);
    }

    public String getModel() {
        return this.model;
    }

    // Method to determine if 2 displays are the same
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Display)) {
            return false;
        }

        Display comparedDisplay = (Display) compared;
        if (this.width == comparedDisplay.width &&
            this.height == comparedDisplay.height &&
            this.ppi == comparedDisplay.ppi &&
                this.model.equals(comparedDisplay.model)) {

            return true;
        }
            
        return false;

    }
}
