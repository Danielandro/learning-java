import java.util.*;

public class ScannerExample {
  public static void main(String[] args) {
    simpleScannerExample();
    harderScannerExample();
  }

  public static void simpleScannerExample() {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    scan.close();
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }

  public static void harderScannerExample() {
    Scanner scan = new Scanner(System.in);
    int integer1 = scan.nextInt();
    double double1 = scan.nextDouble();
    // some of the next methods don't cover their newline chars
    // in order to skip past it, need to call nextLine()
    scan.nextLine();
    String string1 = scan.nextLine();
    scan.close();

    System.out.println("String: " + string1);
    System.out.println("Double: " + double1);
    System.out.println("Int: " + integer1);
  }
}

// TASK
// =======

// Input Format|
// -------------
// There are three lines of input:

// 1. The first line contains an integer.
// 2. The second line contains a double.
// 3. The third line contains a String.

// Output Format|
// --------------
// There are three lines of output:

// 1. On the first line, print String: followed by the unaltered String read
// from stdin.
// 2. On the second line, print Double: followed by the unaltered double read
// from stdin.
// 3. On the third line, print Int: followed by the unaltered integer read from
// stdin.
// =========================================================================================
// SAMPLE INPUT
// 42
// 3.1415
// Welcome to HackerRank's Java tutorials!

// SAMPLE OUTPUT
// String: Welcome to HackerRank's Java tutorials!
// Double: 3.1415
// Int: 42
