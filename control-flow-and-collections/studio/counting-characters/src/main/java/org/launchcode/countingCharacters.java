package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countingCharacters {

    public static void main(String[] args) {
//        String quote = "The man in black fled across the desert, and the gunslinger followed";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your quote: ");
        String quote = input.nextLine();
        char[] charactersInQuote = quote.toLowerCase().toCharArray();
        HashMap<Character, Integer> countingCharacters = new HashMap<>();



        for (char letter : charactersInQuote){
            int count = countingCharacters.containsKey(letter) ? countingCharacters.get(letter) : 0;
            countingCharacters.put(letter, count + 1);
        }

        for (Map.Entry<Character, Integer> character : countingCharacters.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}

