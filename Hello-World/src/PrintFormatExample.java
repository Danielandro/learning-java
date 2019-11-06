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
