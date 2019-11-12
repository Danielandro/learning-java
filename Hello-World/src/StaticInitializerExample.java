import java.util.Scanner;

public class StaticInitializerExample {
  static int B = 0;
  static int H = 0;
  static boolean flag = false;

  static {
    Scanner scanner = new Scanner(System.in);
    B = scanner.nextInt();
    H = scanner.nextInt();
    scanner.close();

    if (B > 0 && H > 0)
      flag = true;
    else
      System.out.println("java.lang.Exception: Breadth and height must be positive");
  }

  public static void main(String[] args) {
    if (flag) {
      int area = B * H;
      System.out.print(area);
    }
  }
}

/*
Static initialization blocks are executed when the class is loaded, 
and you can initialize static variables in those blocks.

TASK
=====
Output the area of a parallelogram with breadth(B) and height(H). 
You should read the variables from the standard input.

If B <= 0 or H <= 0, the output should be: 
"java.lang.Exception: Breadth and height must be positive"

Input Format
-------------
There are two lines of input. 
The first line contains (B), the next line contains (H). 

Output Format
-------------

Sample input 1:      Sample output 1:
---------------      --------------  
1                         3
3

Sample input 2:              Sample output 2:
--------------               ----------------
-1                 java.lang.Exception: Breadth and height must be positive    
2

*/