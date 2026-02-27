import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Revision {
    public static void main(String[] args) {

    int num = 123456, rev = 0;
    while (num!= 0){
        rev = rev*10  + num%10;
         num/=10;
    }
    System.out.println(rev);

    }
}
