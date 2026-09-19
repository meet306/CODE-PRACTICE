  import java.util.*;
  // Find the sum of digits of a number




  public class sumofdigits  {
      public static void main(String[] args) {
        int n = 1234;
        int sum = 0;
        while(n != 0){
          int digit = n%10;
          sum += digit;
          n = n/10;
        }
        System.out.print(sum);
      }
  }