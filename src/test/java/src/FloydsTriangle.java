package src;

import java.util.Scanner;

public class FloydsTriangle {

    public static void main(String[] args) {

        System.out.println("How many rows do you want in Floyd's triangle?");
        Scanner scan = new Scanner(System.in);
        int noOfRow = scan.nextInt();

        int value = 1;
        System.out.println("Floyd's triangle: ");
        for (int i = 1; i <= noOfRow ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(value+"");
                value++;
                System.out.println();

            }

        }

    }
}
