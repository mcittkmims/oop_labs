package com.challenges.parser;

public class TextData {

    private String fileName;
    private String text;
    private int numberOfVowels;
    private int numberOfConsonants;
    private int numberOfLetters;
    private int numberOfSentences;
    private String longestWord;

    public TextData(String fileName, String text) {
        this.fileName = fileName;
        this.text = text;
        this.numberOfVowels = findVowels();
        this.numberOfConsonants = findConsonants();
        this.numberOfLetters = findLetters();
        this.numberOfSentences = 
        this.longestWord = 
    }

    public int findVowels() {
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < this.text.length(); i++) {
            char character = this.text.charAt(i);
            if (vowels.indexOf(character) != -1) {
                vowelCount++;
            }
        }
        return vowelCount;
    }
    
    public int findConsonants() {
        int consonantCount = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < this.text.length(); i++) {
            char character = this.text.charAt(i);
            if (vowels.indexOf(character) == -1 && Character.isLetter(character)) {
                consonantCount++;
            }
        }
        return consonantCount;
    }

    public int findLetters() {
        int letterCount = 0;
        for (int i = 0; i < this.text.length(); i++) {
            if (Character.isLetter(this.text.charAt(i))) {
                letterCount++;
            }
        }
        return letterCount;
    }


    public String getFileName() {
        return fileName;
    }

    public String getText() {
        return text;
    }

    public int getNumberOfVowels() {
        return numberOfVowels;
    }

    public int getNumberOfConsonants() {
        return numberOfConsonants;
    }

    public int getNumberOfLetters() {
        return numberOfLetters;
    }

    public int getNumberOfSentences() {
        return numberOfSentences;
    }

    public String getLongestWord() {
        return longestWord;
    }

}
