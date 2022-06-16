package src;

public class FrequencyOfLetters {

    public static void main(String[] args) {

        frequencyOfChar("abrakadabra");

    }

    static int Max_CHAR = 256;
    public static void frequencyOfChar(String str){

        int count[] = new int[Max_CHAR];
        int length = str.length();

        for (int i = 0; i < length; i++) {
            count[str.charAt(i)]++;

        }
        char ch[] = new char[str.length()];
        for (int i = 0; i < length; i++) {
            ch[i] = str.charAt(i);

            int frequency = 0;
            for (int j = 0; j <= i ; j++) {
                if(str.charAt(i) == ch[j]){
                    frequency++;
                }
                if(frequency ==1){
                    System.out.println("abrakadabra = has " + count[str.charAt(i)] + " times " + str.charAt(i));
                }

            }

        }
    }
}
