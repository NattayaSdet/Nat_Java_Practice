package src;

import java.lang.reflect.Array;
import java.util.Arrays;

public class anagram {

    public static void main(String[] args) {

        System.out.println(isAnagram("anna", "anan"));

    }

    public static boolean isAnagram(String str1, String str2){

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);;
        Arrays.sort(ch2);;

        boolean anagram = Arrays.equals(ch1,ch2);
        return anagram;

    }


}
