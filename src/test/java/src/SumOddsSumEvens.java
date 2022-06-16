package src;

public class SumOddsSumEvens {
    public static void main(String[] args) {

        int[] arr = {1,2,8,10,3,9,7};
        System.out.println(sumOddSumEven(arr));
    }
    public static int sumOddSumEven(int[] arr){

        int sumOdd = 0;
        int sumEven = 0;

        for (int each:arr) {
            if(each%2==0){
                sumEven+= each;
            }else{
                sumOdd+= each;
            }

        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
        return 0;
    }
}
