package com.challenges.parser;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments provided.");
            return;
        }

        String fileText = FileReader.readFileIntoString(args[0]);

        TextData textData = new TextData(args[0], fileText);
        System.out.println(textData);
    }
}
