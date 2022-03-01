package com.example.demo;

import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class WordTransformator {
    private String word;
    private ArrayList<Integer> upperCasePositions;
    private String reversedString;

    public WordTransformator(String word) {
        this.word = word.replaceAll("\\s+", " ").toLowerCase();
        upperCasePositions = new ArrayList<>();
        checkUpperCases();
        reverseString();
        setUpperCases();
    }

    public void checkUpperCases(){
        word = word.trim();
        ArrayList<String> checkList = new ArrayList<>();
        checkList.add("a");
        checkList.add("e");
        checkList.add("i");
        checkList.add("o");
        checkList.add("u");
        int len = word.length();
        for(int i =0; i < len; i++){
            String chara = String.valueOf(word.charAt(i));
            if(checkList.contains(String.valueOf(word.charAt(i)))){
                upperCasePositions.add(i);
            }
        }
    }

    public void reverseString(){
        reversedString = "";
        for(int i = word.length() - 1; i >= 0; i--){
            reversedString += word.charAt(i);
        }
        reversedString = reversedString.toLowerCase();
    }

    public void setUpperCases(){
        String tempReversedString = "";
        char[] characters = reversedString.toCharArray();
        for(int i = 0; i < reversedString.length(); i++){
            if(upperCasePositions.contains(i)){
                tempReversedString += Character.toUpperCase(characters[i]);
            }else{
                tempReversedString += characters[i];
            }
        }
        reversedString = tempReversedString;
    }

    public String getWord(){
        return this.word;
    }

    public String getReversedString(){
        return reversedString;
    }

}
