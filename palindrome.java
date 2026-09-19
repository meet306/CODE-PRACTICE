  import java.util.*;
  // Check whether a number is a palindrome





  public class palindrome{
      public static void main(String[] args) {
        int n = 121;
        int original = n;
        int reverse = 0;
        while(n > 0){
          int digit = n%10;
          reverse = reverse * 10 + digit ;
          n = n/10;
        }
        System.out.println(reverse);
        if (original == reverse){
          System.out.print("the number is palindrome");
        }else{
          System.out.print("the number is not a palindrome");

        }
      }
  }