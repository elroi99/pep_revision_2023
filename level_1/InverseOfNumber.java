import java.lang.*;
import java.io.*;
import java.util.*;

public class InverseOfNumber {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();

    int currPlace = 1;
    int ans = 0;
    while(num > 0){
      int currNum = num % 10;
      num = num / 10;
      ans += currPlace * Math.pow(10 , currNum - 1);
      currPlace++;
    }

    System.out.println(ans);
  }
}