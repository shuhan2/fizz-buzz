import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Contain7Rule implements Rule {

  @Override
  public boolean isMatchRule(int number) {
    return String.valueOf(number).contains("7");
  }

  @Override
  public String getReturnForRule(int number) {
    if (new Contain3Rule().isMatchRule(number)) {
      return "Fizz";
    }
    return Stream.of(new Multiple3Rule(), new Multiple7Rule()).filter(rule -> rule.isMatchRule(number)).map(rule -> rule.getReturnForRule(number)).collect(Collectors.joining());
  }
}
