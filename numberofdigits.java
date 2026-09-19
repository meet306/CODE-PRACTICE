  import java.util.*;
  // Count the number of digits in a number



  public class numberofdigits  {
      public static void main(String[] args) {
        int n = 534443456;
        int count = 0;
        while(n != 0){
          n = n/10;
          count++;
        }
        System.out.print(count);
      }
  }