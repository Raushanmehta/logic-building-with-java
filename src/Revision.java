import java.util.Arrays;

public class Revision {
    public static void main(String[] args) {

        int start = 10, end = 20;

        for (int num = start; num <= end; num++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && num != 1) {
                System.out.println(num);
            }
        }



    }
}
