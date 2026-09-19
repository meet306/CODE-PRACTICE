  import java.util.*;
  // Find the sum of even numbers from 1 to N


  public class sumofeven  {
      public static void main(String[] args) {
        int n = 13;
        int sum = 0;
        for(int i = 1; i <= n; i++){
          if(i %2 == 0){
            sum += i;
          }
        }
        System.out.println(sum);
      }
  }