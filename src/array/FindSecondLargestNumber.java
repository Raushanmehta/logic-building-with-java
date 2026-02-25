package array;

public class FindSecondLargestNumber {
    public static void main(String[] args) {

        int [] arr = {48,6,89,5,8,6};

        int first = Integer.MIN_VALUE,second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            }else if (num > second) {
                second = num;
            }
        }
        System.out.println(second);
    }
}
