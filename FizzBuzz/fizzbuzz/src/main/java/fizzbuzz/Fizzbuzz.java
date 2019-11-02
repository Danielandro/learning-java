package fizzbuzz;

public class Fizzbuzz {
  public String converter(int toConvertToFizzbuzz) {
    if (toConvertToFizzbuzz % 3 == 0) {
      return "Fizz";
    }
    return String.valueOf(toConvertToFizzbuzz);
  }
}