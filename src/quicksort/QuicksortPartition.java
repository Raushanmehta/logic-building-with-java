package quicksort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuicksortPartition {

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(5, 7, 4, 3, 8);
        int pivot = arr.get(0);

        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int num : arr) {

            if (num < pivot) {
                left.add(num);

            } else if (num == pivot) {
                equal.add(num);

            } else  {
                right.add(num);

            }
        }
        List<Integer> result = new ArrayList<>();
        result.addAll(left);
        result.addAll(equal);
        result.addAll(right);
        System.out.println(result);
    }

}

//https://www.hackerrank.com/contests/mountblue-technologies/challenges