package array;

import java.util.Arrays;
import java.util.List;

public class BreakingRecords {
    public static void main(String[] args) {

        List<Integer> score = Arrays.asList(10 ,5 ,20, 20 ,4, 5 ,2, 25, 1);

        int min = score.get(0);
        int max = score.get(0);

        int minCount = 0;
        int maxCount = 0;

        for(int i = 1; i < score.size(); i++){
         int current = score.get(i);
         if(current > max){
             max = current;
             maxCount++;

         }else if(current < min){
             min = current;
             minCount++;
         }
        }
        System.out.println(maxCount);
        System.out.println(minCount);
    }
}
