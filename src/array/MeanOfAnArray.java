package array;

public class MeanOfAnArray {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        int sum =0;
        for(int i : arr) {
            sum = sum + i;
        }
        int mean = sum/arr.length;
        System.out.println(mean);
    }
}
