package edu.cnm.deepdive.fizzbuzz;

public class Main {

  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      boolean divisibleBy3 = (i % 3 == 0);
      boolean divisibleBy5 = (i % 5 == 0);
      if (divisibleBy3 || divisibleBy5){
        if(divisibleBy3){
        System.out.println("fizz");

        }
        if(divisibleBy5){
          System.out.println("buzz");

        }

      } else {
        System.out.println(i);
      }
      System.out.println();
    }

  }


}
