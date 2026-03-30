package array;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,1,2,1,3,1,2};

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for( int sock : arr){
            map.put(sock, map.getOrDefault(sock, 0)+1);
        }
         int pairs = 0;

        for (int count : map.values()){
            pairs += count /2;
        }
        System.out.println(pairs);
    }
}
