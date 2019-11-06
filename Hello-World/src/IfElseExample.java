import java.util.Scanner;

public class IfElseExample {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int N = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    scanner.close();

    if (!numIsEven(N))
      System.out.println("Weird");
    else if (N >= 2 && N <= 5)
      System.out.println("Not Weird");
    else if (N <= 20)
      System.out.println("Weird");
    else
      System.out.println("Not Weird");
  }

  public static Boolean numIsEven(int num) {
    return (num % 2 == 0);
  }
}

// TASK:
// Given an integer(N), perform the following conditional actions:

// If N is odd, print Weird
// If N is even and in the inclusive range of to , print Not Weird
// If N is even and in the inclusive range of to , print Weird
// If N is even and greater than , print Not Weird

// N is between 1-100 (inclusive)