package org.launchcode.java.studios.countingchars;

import java.util.HashMap;
import java.util.Map;

public class Count {
    public static void main(String[] args) {
        String words = "If the product of two terms is zero then common sense says at least one of the two terms has to" +
                " be zero to start with. So if you move all the terms over to one side, you can put the quadratics into " +
                "a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, " +
                "it’s pretty straightforward from there.";
        //char[] charInStr = quote.toCharArray();
        String lowerWords = words.toLowerCase();
        int count ;
        char letter ;

        HashMap<Character, Integer> charEach = new HashMap<>();
        for (int i = 0; i < lowerWords.length(); i++) {
            letter = lowerWords.charAt(i);
            //if character is there add count by one each time
            if(charEach.containsKey(letter)) {
                count = charEach.get(letter);
                count++;
            //update new count
                charEach.replace(letter, count);
            } else {
            //new char start at one
                charEach.put(letter, 1);
            }
        }
        for (Character key : charEach.keySet()) {
            System.out.println(key + ":" + charEach.get(key));
        }
    }
}
