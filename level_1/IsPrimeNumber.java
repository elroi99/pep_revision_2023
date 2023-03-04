import java.lang.*;
import java.util.*;
import java.io.*;

public class IsPrimeNumber{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();

    for(int i = 2 ; i <= Math.floor(Math.sqrt(num)) ; i++){
        if(num % i == 0){
          System.out.println("is not prime");
          return;
        }
    }
    System.out.println("is prime");
  }
}




