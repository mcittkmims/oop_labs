package com.challenges.parser;

public class Main {
    public static void main(String[] args) {
        String path = "src/main/java/com/challenges/parser/filetext.txt";
        String text = FileReader.readFileIntoString(path);
        System.out.println(text);

        TextData input = new TextData(path, text);
        System.out.println(input);
    }
}
