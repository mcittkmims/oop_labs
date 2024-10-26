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
        this.numberOfVowels = findVowelCount();
        this.numberOfConsonants = findConsonantCount();
        this.numberOfLetters = findLetterCount();
        this.numberOfSentences = findSentenceCount();
        this.longestWord = findLongestWord();
    }

    // Method to count all voewls from text
    public int findVowelCount() {
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
    
    // Method to count all consonants from text
    public int findConsonantCount() {
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

    // Method to count all letters from text
    public int findLetterCount() {
        int letterCount = 0;
        for (int i = 0; i < this.text.length(); i++) {
            if (Character.isLetter(this.text.charAt(i))) {
                letterCount++;
            }
        }
        return letterCount;
    }

    // Method to count all sentences from text
    public int findSentenceCount() {
        int sentenceCount = 0;
        // Splitting the text on punctuation signs
        String[] sentences = this.text.split("[.!?]+");
        // Not counting empty elements
        for (String sentence : sentences) {
            if (!sentence.isBlank()) {
                sentenceCount++;
            }
        }
        return sentenceCount;
    }
    
    // Method to find largest word
    public String findLongestWord() {
        int maxLength = 0;
        String longestWord = null;
        String[] words = this.text.split("[ .!?,\"']+");
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }
        return longestWord;
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

    @Override
    public String toString() {
        return this.fileName + " ("  + this.numberOfVowels + ", " + this.numberOfConsonants + ", "
                + this.numberOfLetters + ", " + this.numberOfSentences + ", " + this.longestWord + "): " + this.text;
    }

}
