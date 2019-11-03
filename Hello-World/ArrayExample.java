import java.util.Arrays;

public class ArrayExample {
  public static void main(String[] args) {
    // create an array, max length = 5
    int[] numbers = new int[5];
    System.out.println("Numbers has " + numbers.length + " items");
    System.out.println(Arrays.toString(numbers));

    // create array with initial values
    int[] numbers2 = { 1, 2, 3, 4, 5 };

    // use Arrays.toString to print array, otherwise receive mem address
    System.out.println(Arrays.toString(numbers2));

    multiDimensionalArray();
  }

  public static void multiDimensionalArray() {
    // create 2D array [[1,2,3], [1,2,3]]
    int[][] numbers = new int[2][3];
    // use deepToString method to print array
    System.out.println(Arrays.deepToString(numbers));

    // can also declare initial values
    int[][] numbers2 = { { 1, 2, 3 }, { 4, 5, 6 } };
    System.out.println(Arrays.deepToString(numbers2));
  }
}