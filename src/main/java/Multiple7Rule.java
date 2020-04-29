public class Multiple7Rule implements Rule {

  @Override
  public boolean isMatchRule(int number) {
    return number % ZzType.WHIZZ.getTargetNumber() == 0;
  }

  @Override
  public String getReturnForRule(int number) {
    return ZzType.WHIZZ.parse(number);
  }
}
