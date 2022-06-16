package src;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        String[] arr = {"apple", "bat", "apple", "car"};
        frequencyOfWord(arr);
    }

    // Write your solution here...
    public static void frequencyOfWord(String[] arr){

        String checked = "";
        int count = 0;

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));

        for (String each : list) {

            for (int i = 0; i < arr.length; i++) {

                if(!checked.contains(each)){

                    for (int j = 0; j <= i; j++) {
                        count++;

                    }
                }
                checked+= each;

                System.out.println(count +" "+"for"+" " + each);
            }


        }

    }
}