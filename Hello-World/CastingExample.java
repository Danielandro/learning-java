public class CastingExample {
  public static void main(String[] args) {
    // IMPLICIT CASTING
    // primitives auto convert into bigger values
    // e.g. byte > short > int > long > float > double
    short a = 4;
    int b = a + 5;
    System.out.println(b); // 9

    // Here doubles are more precise so 4 => 4.0
    // prevents data loss
    double c = 2.2;
    double d = c + 4;
    System.out.println(d); // 6.2

    // EXPLICIT CASTING
    // to convert to less precise type, need to cast
    // only for compatible types
    double e = 2.7;
    int f = (int) e + 4;
    System.out.println(f); // 6

    // WRAPPER CLASSES
    // all primitives have a wrapper class
    // they provide useful methods
    String g = "10";
    double h = Double.parseDouble(g) + 2.2;
    System.out.println(h); // 12.2
  }
}
