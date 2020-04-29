public class Multiple7Rule implements Rule {

  @Override
  public String getReturnForRule(int number) {
    return ZzType.WHIZZ.parse(number);
  }
}
