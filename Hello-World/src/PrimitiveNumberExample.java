import java.util.Scanner;

public class PrimitiveNumberExample {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt(); // number of test cases

    for (int i = 0; i < t; i++) {
      try {
        long x = scanner.nextLong(); // num under test
        System.out.println(x + " can be fitted in:");
        if (x >= -128 && x <= 127)
          System.out.println("* byte");
        if (x >= -32_768 && x <= 32_767)
          System.out.println("* short");
        if (x >= -2_147_483_648 && x <= 2_147_483_647)
          System.out.println("* int");
        if (x >= -9_223_372_036_854_775_808L && x <= 9_223_372_036_854_775_807L)
          System.out.println("* long");
      } catch (Exception e) {
        System.out.println(scanner.next() + " can't be fitted anywhere.");
      }
      scanner.close();
    }
  }
}

/*
 * TASK ======
 * 
 * Java has 8 primitive data types; char, boolean, byte, short, int, long,
 * float, and double. For this exercise, we'll work with the primitives used to
 * hold integer values (byte, short, int, and long):
 * 
 * A byte is an 8-bit signed integer (-128 to 127) A short is a 16-bit signed
 * integer (-32k to 32k) An int is a 32-bit signed integer (-2 billion to 2
 * billion) A long is a 64-bit signed integer (-9 quintillion to 9 quinitillion)
 * 
 * Given an input integer, you must determine which primitive data types are
 * capable of properly storing that input.
 * 
 * Sample Input -------------- 5 -150 150000 1500000000
 * 213333333333333333333333333333333333 -100000000000000
 * 
 * Sample Output -------------- -150 can be fitted in: short int long 150000 can
 * be fitted in: int long 1500000000 can be fitted in: int long
 * 213333333333333333333333333333333333 can't be fitted anywhere.
 * -100000000000000 can be fitted in: long
 * 
 * https://www.hackerrank.com/challenges/java-datatypes/problem?h_r=next-
 * challenge&h_v=zen
 */
