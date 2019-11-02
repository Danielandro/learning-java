package fizzbuzz;

public class Fizzbuzz {
  public String converter(int toConvertToFizzbuzz) {
    if (toConvertToFizzbuzz % 15 == 0) {
      return "Fizzbuzz";
    }

    if (toConvertToFizzbuzz % 3 == 0) {
      return "Fizz";
    }

    if (toConvertToFizzbuzz % 5 == 0) {
      return "Buzz";
    }

    return String.valueOf(toConvertToFizzbuzz);
  }
}