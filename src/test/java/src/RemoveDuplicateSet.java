package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateSet {

    public static void main(String[] args) {

        ArrayList<String> list= new ArrayList<>();
        list.addAll(Arrays.asList("nattaya", "nattaya", "nattaya"));

        System.out.println(removeDup(list));

    }
    public static Set<String> removeDup(ArrayList<String> list){

        Set<String> s = new LinkedHashSet<>(list);
        return s;
    }

}
