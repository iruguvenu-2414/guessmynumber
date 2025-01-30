// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Random;
import java.util.Scanner;

public class guessmynumber {
   public guessmynumber() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      Random var2 = new Random();
      int var3 = var2.nextInt(100) + 1;
      int var4 = 0;
      boolean var5 = false;
      System.out.println("Welcome to the 'Guess My Number' game!");
      System.out.println("I have selected a number between 1 and 100. Can you guess it?");

      while(!var5) {
         System.out.print("Enter your guess: ");
         int var6 = var1.nextInt();
         ++var4;
         if (var6 < var3) {
            System.out.println("Too low! Try again.");
         } else if (var6 > var3) {
            System.out.println("Too high! Try again.");
         } else {
            var5 = true;
            System.out.printf("Congratulations! You've guessed the number %d in %d tries.%n", var3, var4);
         }
      }

      var1.close();
   }
}
