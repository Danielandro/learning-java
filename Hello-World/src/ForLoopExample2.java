import java.util.Scanner;

public class ForLoopExample2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int q = in.nextInt();
    for (int i = 0; i < q; i++) {
      int a = in.nextInt();
      int b = in.nextInt();
      int n = in.nextInt();
      StringBuilder currentSeries = new StringBuilder();
      int result = a;

      for (int j = 0; j < n; j++) {
        int nextInSeries = (int) Math.pow(2, j) * b;
        result += nextInSeries;
        currentSeries.append(result + " ");
      }
      System.out.println(currentSeries.toString());

    }
    in.close();
  }
}

// Task
// https://www.hackerrank.com/challenges/java-loops/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
