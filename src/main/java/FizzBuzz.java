public class FizzBuzz {

  public String transform(int number) {
    if ((number % ZzType.FIZZ.getNumber()) == 0) {
      return ZzType.FIZZ.getString();

    }
    if ((number % ZzType.BUZZ.getNumber()) == 0) {
      return ZzType.BUZZ.getString();

    }
    if ((number % ZzType.WHIZZ.getNumber()) == 0) {
      return ZzType.WHIZZ.getString();

    }
    return String.valueOf(number);
  }
}
