package array;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int [] arr = {4,9,3,8,4,9,2};

        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : arr){
            set.add(num);
        }
        System.out.println(set);

    }
}
