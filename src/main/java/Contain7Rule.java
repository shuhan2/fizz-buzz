import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Contain7Rule implements Rule {

  private List<Rule> rules = Arrays.asList(new Multiple3Rule(), new Multiple7Rule());

  @Override
  public boolean isMatchRule(int number) {
    return String.valueOf(number).contains("7");
  }

  @Override
  public String getReturnForRule(int number) {
    return rules.stream().map(rule -> rule.getReturnForRule(number)).collect(Collectors.joining());
  }
}
