import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    Random rand2 = new Random();
    Scanner numbers = new Scanner(System.in);
    Scanner words = new Scanner(System.in);
    int value1;
    int value2;
    int answer=0;
    String quitting;
    int x=0;
    int problemsCorrect = 0;
    int totalTries = 0;
    System.out.println(
        "Brush up on those times tables, kids! It's multiplication time!");
    System.out.println("Would you like to play? (Q to quit)");
    String initialquitchance = words.next();
    if (initialquitchance.equalsIgnoreCase("Q")) {
      System.exit(0);
    } else {

    }

    do {

      do {
        value1= rand.nextInt(13) + 1;
        value2 = rand2.nextInt(13) + 1;
        System.out.println("What is " + value1 + " X " + value2+"?");
        try{
          x = numbers.nextInt();
        answer = value1 * value2;
        }catch (java.util.InputMismatchException e) {continue;}
        if (x == answer) {
          System.out.println("Correct!");
          problemsCorrect++;
        } else {
          System.out.println("I get angrier for every problem you get wrong!~ Try again mate~");
        }
        totalTries++;
      } while (x != answer);
      System.out.println("Would you like to play again? (Q to quit)");
      quitting = words.next();
    } while (!quitting.equalsIgnoreCase("Q"));
  }
}