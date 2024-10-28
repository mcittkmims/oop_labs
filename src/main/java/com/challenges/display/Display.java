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
        int thisSize = this.width * this.height;
        int otherSize = m.width * m.height;
        // Check size attribute
        if (thisSize > otherSize) {
            System.out.print(this.model + " is bigger than " + m.model);
            return;
        }
        if (thisSize < otherSize) {
            System.out.print(this.model + " is smaller than " + m.model);
            return;
        }
        System.out.print(this.model + " has the same size as " + m.model);
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
