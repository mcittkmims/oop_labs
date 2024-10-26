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

    public void assignDisplay(Display d) {
        this.assignedDisplays.add(d);
    }
    
    public void assist() {
        for (int i = 0; i < this.assignedDisplays.size() - 1; i++) {

            Display mainDisplay = this.assignedDisplays.get(i);
            Display comparedDisplay = this.assignedDisplays.get(i + 1);

            System.out.println("Model: " + mainDisplay.getModel());
            mainDisplay.compareWithMonitor(comparedDisplay);
        }
    }


}
