import java.util.*;
import java.lang.*;
import java.io.*;

public class RotateNumber {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int rotateBy = scn.nextInt();
    System.out.println(num);
    System.out.println(rotateBy);

    // find length
    int numCopy = num;
    int len = 0;
    while (numCopy > 0) {
      numCopy = numCopy / 10;
      len++;
    }
    // now we know the length

    if (rotateBy > len) {
      rotateBy = rotateBy % len;
    }
    // // calculate the final rotate by
    if (rotateBy < 0) {
      rotateBy = len - rotateBy;
    }

    // we have the final rotateBy value

    // actual rotation starts here
    int partOne = num / (int) Math.pow(10, rotateBy);
    int partTwo = num % (int) Math.pow(10, rotateBy);
    int partThree = partTwo * (int) Math.pow(10, len - rotateBy);
    int ans = partOne + partThree;
    System.out.println(ans);

  }

}