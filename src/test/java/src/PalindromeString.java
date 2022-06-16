package src;

public class PalindromeString {

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));

    }
    public static boolean isPalindrome(String str){

        String reversed = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversed += str.charAt(i);

        }
        boolean palindrome = reversed.equalsIgnoreCase(str);
        return palindrome;
    }
}
