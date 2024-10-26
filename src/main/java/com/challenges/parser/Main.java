package com.challenges.parser;

public class Main {
    public static void main(String[] args) {
        String text = FileReader.readFileIntoString("src/main/java/com/challenges/parser/filetext.txt");
        System.out.println(text);
    }
}
