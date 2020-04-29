public class Contain5Rule implements Rule {

  @Override
  public boolean isMatchRule(int number) {
    return String.valueOf(number).contains("5");
  }

  @Override
  public String getReturnForRule(int number) {
    return new DefaultRule().getReturnForRule(number);
  }
}
