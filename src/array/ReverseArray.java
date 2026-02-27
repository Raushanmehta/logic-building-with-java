package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {

//        Integer [] arr = {4,9,3,8,2};
//        List<Integer> list = Arrays.asList(arr);
//        Collections.reverse(list);
//
//        System.out.println("Reverse array is: " + Arrays.toString(arr));

        int[] arr = {5,9,3,8,9,2};
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
