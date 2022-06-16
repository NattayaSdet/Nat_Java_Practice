package src;

public class SumAllDigits {
    public static void main(String[] args) {

        System.out.println(sumAllDigits(1346));

    }

    public static int sumAllDigits(int num) {

        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }

        return sum;

    }
}
