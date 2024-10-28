package com.challenges.parser;

import java.nio.file.Paths;
import java.util.Scanner;

public class FileReader {
    
    // Method to read the file content
    public static String readFileIntoString(String path) {
        //Get the text line by line until the end
        String fileText = "";
        try (Scanner scanner = new Scanner(Paths.get(path))) {
            while (scanner.hasNextLine()) {
                fileText += scanner.nextLine() + "\n";
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return fileText;
        
    }
}