import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultRule implements Rule {

  private List<Rule> rules = Arrays.asList(new Multiple3Rule(),
                                           new Multiple5Rule(),
                                           new Multiple7Rule());

  @Override
  public boolean isMatchRule(int number) {
    return rules.stream().anyMatch(rule -> rule.isMatchRule(number)) ;
  }

  @Override
  public String getReturnForRule(int number) {
    return rules.stream()
        .map(rule -> rule.getReturnForRule(number))
        .collect(Collectors.joining());
  }
}
