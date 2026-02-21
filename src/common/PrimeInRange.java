package common;

public class PrimeInRange {
    public static void main(String[] args) {

        int start = 1, end = 10;

        for (int num = start; num <= end; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && num > 1) {
                System.out.println(num + " ");
            }
        }
    }
}
