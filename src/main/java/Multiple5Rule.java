public class Multiple5Rule implements Rule {

  @Override
  public boolean isMatchRule(int number) {
    return number % ZzType.BUZZ.getTargetNumber() == 0;
  }

  @Override
  public String getReturnForRule(int number) {
    return ZzType.BUZZ.parse(number);
  }
}
