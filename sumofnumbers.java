import java.util.*;
// Find the sum of numbers from 1 to N


public class sumofnumbers  {
    public static void main(String[] args) {
      int n = 5;
      int sum = 0;
      for(int i = 1; i <= n; i++){
      // System.out.println(i);
      sum += i;

      }
      System.out.println(sum);
    }
}