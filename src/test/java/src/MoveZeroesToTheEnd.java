package src;

import java.util.Arrays;

public class MoveZeroesToTheEnd {

    public static void main(String[] args) {
        int [] nums = {6,3,5,9,1,0,3,8};
        System.out.println(Arrays.toString(moveZerosToTheEnd(nums)));

    }
    public static int[] moveZerosToTheEnd(int[] arr1){

        int[] arr2 = new int[arr1.length];
        int count = 0;

        for (int i = 0; i < arr1.length-1 ; i++) {
            if(arr1[i] !=0){
                arr2[count++] = arr1[i];
            }

        }
        return arr2;
    }
}
