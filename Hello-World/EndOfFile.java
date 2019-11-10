public class EndOfFile {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    short lineNumber = 1;
    while (scanner.hasNext) {
      String currentLine = scanner.nextLine();
      System.out.printf("%d %s%n", lineNumber, currentLine);
      lineNumber++;
    }
  }
}

/*
 * End of File: no more data can be read from a source
 * 
 * TASK ==== The challenge here is to read lines of input until you reach EOF,
 * then number and print all lines of content.
 * 
 * Input Format: Read some unknown, n, lines of input from stdin(System.in)
 * until you reach EOF; each line of input contains a non-empty String.
 * 
 * Output Format: For each line, print the line number, followed by a single
 * space, and then the line content received as input.
 * 
 * Sample Input ------------ Hello world I am a file Read me until end-of-file.
 * 
 * Sample Output ------------- 1 Hello world 2 I am a file 3 Read me until
 * end-of-file.
 */
