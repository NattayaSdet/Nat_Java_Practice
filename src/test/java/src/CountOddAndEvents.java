package src;

public class CountOddAndEvents {

    public static void main(String[] args) {
        int[] arr = {1,2,8,10,3,9,7};
        System.out.println(countOddCountEven(arr));
    }
    public static int countOddCountEven(int[] arr){

        int countOdd = 0;
        int countEven = 0;

        for (int each:arr) {
            if(each%2==0){
                countEven++;
            }else{
                countOdd++;
            }

        }
        System.out.println(countEven);
        System.out.println(countOdd);
        return 0;
    }

}
