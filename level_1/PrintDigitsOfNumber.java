import java.util.*;
import java.lang.*;
import java.io.*;

class PrintDigitsOfNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    // find length
    int numCopy = num;
    int length = 0;
    while(numCopy > 0) {
      numCopy = numCopy / 10;
      length++;
    }
    System.out.println(length);

      // we now know the length
    for(int i = 0 ; i < length ; i++){
      int currDigit = num / (int)Math.pow(10 , length - (i + 1));
      num = num % (int)Math.pow(10 , length - (i + 1));
      System.out.println(currDigit);
    }
    
  }

}
