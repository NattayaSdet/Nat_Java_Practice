package src;

public class PalindromeInt {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }
    public static boolean isPalindrome(int num){

        int reversedNum = 0;
        int remainder;
        int originalNum = num;

        while(num!=0){
            remainder = num%10;
            reversedNum = reversedNum*10+remainder;
            num/=10;
        }
        return originalNum == reversedNum;
    }
}
