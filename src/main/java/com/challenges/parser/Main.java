package com.challenges.parser;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments provided.");
            return;
        }

        // Loop to check each argument
        for (String arg : args) {
            
            String fileText = FileReader.readFileIntoString(arg);

            TextData textData = new TextData(arg, fileText);
            System.out.println(textData);
        }
    }
}
