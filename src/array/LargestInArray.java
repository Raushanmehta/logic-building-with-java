package array;

public class LargestInArray {
    public static void main(String[] args) {

        int [] arr = {4,9,3,8,2};

        int largest = arr[0];

        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println(largest);
    }
}
