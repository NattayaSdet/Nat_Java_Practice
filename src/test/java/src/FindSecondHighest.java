package src;

import java.util.ArrayList;
import java.util.Collections;

public class FindSecondHighest {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6,6};
        System.out.println(findNMax(arr));

    }
    public static int findNMax(int[] arr){

       ArrayList<Integer> list = new ArrayList<>();
        for (int each:arr) {
            list.add(each);
        }
        int n = 2;
        int result = 0;

        for (int i = 1; i <n ; i++) {
            list.removeIf(p->Collections.max(list)==p);

        }
        result = Collections.max(list);
        return result;

    }

}
