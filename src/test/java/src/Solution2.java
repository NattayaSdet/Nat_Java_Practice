package src;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {

    public static void main(String[] args) {
        String[] arr = {"apple", "bat", "apple", "car"};
        frequencyOfWord(arr);
    }

    // Write your solution here...
    public static void frequencyOfWord(String[] arr) {

        String result = "";


        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));

        for (String each : list) {

            for (int j = 0; j < arr.length; j++) {

                String word = each;

                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    String eachWord = each;

                    if (word == eachWord) {
                        count++;
                    }

                }
                if (result.contains("" + word)) {
                    continue;

                }
                result += " " + "for" + " " + word;


            }


        }
    }

}
