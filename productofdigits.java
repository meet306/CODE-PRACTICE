  import java.util.*;
  // Find the product of digits of a number



  public class productofdigits  {
      public static void main(String[] args) {
        int n = 235;
        int sum = 1;
        while(n > 0){
          int digit = n%10;
          sum = sum * digit;
          n = n/10;
        }
        System.out.print(sum);
      }
  }