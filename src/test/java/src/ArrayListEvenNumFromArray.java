package src;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEvenNumFromArray {

    public static void main(String[] args) {

        int[] arr = {-400,-6,0, 1, 2, 3, 4, 5, 6, 200, 2000, 2000};
        System.out.println(evenList(arr));


    }
   public static ArrayList<Integer> evenList(int[] arr){

        ArrayList<Integer> list = new ArrayList<>();
        for (int each:arr) {
           list.add(each);

       }
       ArrayList<Integer> evenList = new ArrayList<>();
       for (int i = 0; i < list.size() ; i++) {
           if(list.get(i)==0){
               list.remove(list.get(i));
           }
           if(list.get(i)%2==0){
               evenList.add(list.get(i));
           }

       }
       return evenList;
   }
}
