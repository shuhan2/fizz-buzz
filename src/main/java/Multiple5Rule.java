public class Multiple5Rule implements Rule {

  @Override
  public String getReturnForRule(int number) {
    return ZzType.BUZZ.parse(number);
  }
}
