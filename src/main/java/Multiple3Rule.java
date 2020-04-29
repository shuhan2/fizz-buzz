public class Multiple3Rule implements Rule {


  @Override
  public String getReturnForRule(int number) {
    return ZzType.FIZZ.parse(number);
  }
}
