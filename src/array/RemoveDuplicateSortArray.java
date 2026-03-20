package array;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicateSortArray {
    public static void main(String[] args) {

        int [] arr = {2,2,2,2};

        HashMap<Integer,Integer> remove = new HashMap<>();
        for(int num : arr){
            remove.put(num,num);
        }
        System.out.println(Arrays.toString(remove.keySet().toArray()));

    }
}
