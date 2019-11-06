import java.util.Scanner;

public class PrintFormatExample {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("================================");
    // user enters three strings
    for (int i = 0; i < 3; i++) {
      String str = scanner.next();
      int num = scanner.nextInt();
      // - :justfies left
      // 14 :fourteen char string
      // %03d :3 digit integer with leading zeros
      System.out.printf("%-14s %03d%n", str, num);
    }
    scanner.close();
    System.out.println("================================");
  }
}

// TASK
// =========
// Input Format:
// --------------
// Every line of input will contain a String followed by an integer.
// Each String will have a maximum of alphabetic characters, and each integer
// will be in the inclusive range from to .

// Output Format
// --------------
// In each line of output there should be two columns:
// The first column contains the String and is left justified using exactly
// characters.
// The second column contains the integer, expressed in exactly digits; if the
// original input has less than three digits, you must pad your output's leading
// digits with zeroes.

// Sample Input

// java 100
// cpp 65
// python 50
// Sample Output

// ================================
// java 100
// cpp 065
// python 050
// ================================