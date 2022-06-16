package src;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();
        System.out.println("Please enter number of digits");
        int digit = scan.nextInt();
        int temp = number;
        int sum = 0;

        do {
            int value = temp % 10;
            temp /= 10;
            sum += Math.pow(value, digit);
        }while(temp>0);
        if(5 == sum){
            System.out.println("This is Armstrong number");
        }else{
            System.out.println("This is not Armstrong number");
        }

    }
}
