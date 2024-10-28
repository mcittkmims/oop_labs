package com.challenges.parser;

public class TextData {

    private String fileName;
    private String text;
    private int numberOfVowels;
    private int numberOfConsonants;
    private int numberOfLetters;
    private int numberOfSentences;
    private String longestWord;

    public TextData(String path, String text) {
        this.fileName = getFileName(path);
        this.text = text;
        this.numberOfVowels = getVowelCount();
        this.numberOfConsonants = getConsonantCount();
        this.numberOfLetters = getLetterCount();
        this.numberOfSentences = getSentenceCount();
        this.longestWord = findLongestWord();
    }

    // Method to extrect file name from path
    public static String getFileName(String path) {
        if (path.indexOf('/') == -1) {
            return path;
        }
        String[] folders = path.split("/");
        return folders[folders.length - 1];
        
    }


    // Method to count all voewls from text
    private int getVowelCount() {
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
    public int getConsonantCount() {
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
    public int getLetterCount() {
        int letterCount = 0;
        for (int i = 0; i < this.text.length(); i++) {
            if (Character.isLetter(this.text.charAt(i))) {
                letterCount++;
            }
        }
        return letterCount;
    }

    // Method to count all sentences from text
    public int getSentenceCount() {
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
        String[] words = this.text.split("[ .!?,\"'\n]+");
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
        return this.fileName + " ("  + this.numberOfVowels + " vowels" + ", " + this.numberOfConsonants + " consonants" + ", "
                + this.numberOfLetters + " letters" + ", " + this.numberOfSentences + " sentences" + ", " + this.longestWord 
                + " is longest" + "): " + this.text;
    }

}
