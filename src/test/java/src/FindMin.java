package src;

public class FindMin {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(min(arr));
    }
    public static int min(int[] arr){

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min){
                min = arr[i];
            }

        }
        return min;
    }
}
