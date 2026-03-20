import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Revision {
    public static void main(String[] args) {

      int [] arr = {5,9,3,1};

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
