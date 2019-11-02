package fizzbuzz;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    static Fizzbuzz fizzbuzz1 = new Fizzbuzz();

    public static void main(String[] args) {
        System.out.println("Hello World!");
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzbuzz1.converter(i));
        }
    }
}
