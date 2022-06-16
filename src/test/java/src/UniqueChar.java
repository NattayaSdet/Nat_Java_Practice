package src;

public class UniqueChar {

    public static void main(String[] args) {
        System.out.println(unique("nattaya"));
    }
    public static String unique(String str){

        String  unique ="";
        for (int i = 0; i < str.length(); i++) {
            if(!unique.contains(""+str.charAt(i))){
                unique += str.charAt(i);
            }

        }
        return unique;
    }
}
