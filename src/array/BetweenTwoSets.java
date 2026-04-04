package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {

    public static int gcd(int a, int b){
        if (b== 0){
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }

    public static int getTotal1X(List<Integer> a, List<Integer> b) {

        int lcmA = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            lcmA = lcm(lcmA, a.get(i));
        }

        int gcdB = b.get(0);
        for (int i = 1; i < b.size(); i++) {
            gcdB = gcd(gcdB, b.get(i));
        }

        int count = 0;
        for (int muntiple = lcmA; muntiple <= gcdB; muntiple += lcmA) {
            if (gcdB % muntiple == 0){
                count++;
            }

        }
        return count;

    }

    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(2,4);
        List<Integer> b = Arrays.asList(16,32,96);

        System.out.println(getTotal1X(a,b));
    }

}
