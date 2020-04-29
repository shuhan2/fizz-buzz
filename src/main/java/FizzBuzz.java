public class FizzBuzz {

  public String transform(int number) {
    if (number % 3 ==0) {
      return "Fizz";
    }
    return String.valueOf(number);
  }
}
