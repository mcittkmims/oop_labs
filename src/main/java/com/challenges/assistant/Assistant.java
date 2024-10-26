package com.challenges.assistant;

import java.util.ArrayList;
import java.util.List;

import com.challenges.display.Display;

public class Assistant {
    private String assistantName;
    List<Display> assignedDisplays;

    public Assistant(String name) {
        this.assistantName = name;
        this.assignedDisplays = new ArrayList<>();
    }

    // Adding a display to the list
    public void assignDisplay(Display d) {
        this.assignedDisplays.add(d);
    }
    
    // Method to compare each display with the next display in the list
    public void assist() {
        for (int i = 0; i < this.assignedDisplays.size() - 1; i++) {

            Display mainDisplay = this.assignedDisplays.get(i);
            Display comparedDisplay = this.assignedDisplays.get(i + 1);

            System.out.println("Model: " + mainDisplay.getModel());
            mainDisplay.compareWithMonitor(comparedDisplay);
        }
    }

    // Method to remove a specific Display object
    public Display buyDisplay(Display d) {
        Display boughtDisplay = null;

        // It works even if the Display d has different reference
        for (Display display : this.assignedDisplays) {
            if (display.equals(d)) {
                System.out.println(display);
                boughtDisplay = display;
                this.assignedDisplays.remove(display);
                break;
            }
        }
        return boughtDisplay;
    }

    public String getAssistantName() {
        return this.assistantName;
    }

    public List<Display> assignedDisplays() {
        return this.assignedDisplays;
    }
}
