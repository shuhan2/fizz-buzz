public enum ZzType {
  FIZZ(3, "Fizz"),
  BUZZ(5, "Buzz"),
  WHIZZ(7, "Whizz");

  private int targetNumber;
  private String returnValue;

  public int getTargetNumber() {
    return targetNumber;
  }

  public String getReturnValue() {
    return returnValue;
  }

  ZzType(int targetNumber, String returnValue) {
    this.targetNumber = targetNumber;
    this.returnValue = returnValue;
  }

  public String parse(int number) {
    return number % targetNumber == 0 ? returnValue : "";

  }
}
