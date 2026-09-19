import java.util.*;
// Check whether a year is a leap year


public class leapyear {
    public static void main(String[] args) {
      int year = 2032;
      if((year %400 == 0) || (year %4 == 0 && year %100 != 0)){
        System.out.print("leap year");
      }else{
        System.out.print("not a leap year");

      }
    }
}