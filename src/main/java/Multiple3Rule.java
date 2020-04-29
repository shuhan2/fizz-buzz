public class Multiple3Rule implements Rule {

  @Override
  public boolean isMatchRule(int number) {
    return number % ZzType.FIZZ.getTargetNumber() == 0;
  }

  @Override
  public String getReturnForRule(int number) {
    return ZzType.FIZZ.parse(number);
  }
}
