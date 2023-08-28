package org.launchcode;

public class Arrays {
    public static void main(String[] args) {
        int[] digits = {1, 1, 2, 3, 5, 8, 13, 21, 34, 56};


        for (int digit : digits){
            if (digit % 2 != 0) {
                System.out.println(digit);
            }
        }

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split("");

        for (String word : words) {
            System.out.println(Arrays.toString(word));
        }


    }
}
