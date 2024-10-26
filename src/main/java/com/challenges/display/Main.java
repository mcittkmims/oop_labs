package com.challenges.display;

public class Main {
    public static void main(String[] args) {
        Display samsung = new Display(1920, 1080, 400, "Samsung");
        Display mac = new Display(2560, 1440, 300, "Mac");
        Display acer = new Display(1920, 1080, 400, "Acer");
        
        System.out.println("");
        samsung.compareSize(mac);
        mac.compareSize(acer);
        samsung.compareSize(acer);

        System.out.println("");       
        samsung.compareSharpness(mac);
        mac.compareSharpness(acer);
        samsung.compareSharpness(acer);
        
        System.out.println("");
        samsung.compareWithMonitor(mac);
        mac.compareWithMonitor(acer);
        samsung.compareWithMonitor(acer);


    }
}
