package array;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {

        int [] arr1 = {4,6,8,9};
        int [] arr2 = {1,2,3,4};

        int [] merged = new int[arr1.length+arr2.length];
        System.arraycopy(arr1,0,merged,0,arr1.length);
        System.arraycopy(arr2,0,merged,arr1.length,arr2.length);

        Arrays.sort(merged);

        System.out.println(Arrays.toString(merged));
    }
}
