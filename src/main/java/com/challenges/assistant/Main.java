package com.challenges.assistant;

import com.challenges.display.Display;

public class Main {
    public static void main(String[] args) {
        Assistant john = new Assistant("John");
        john.assignDisplay(new Display(1920, 1080, 400, "Samsung"));
        john.assignDisplay(new Display(2560, 1440, 300, "Mac"));
        john.assignDisplay(new Display(1920, 1080, 400, "Acer"));

        john.assist();

        Display boughtDisplay = john.buyDisplay(new Display(1920, 1080, 400, "Samsung"));
        System.out.println(boughtDisplay);

        john.assist();
    }
}
