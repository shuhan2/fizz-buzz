import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzz {

  public String transform(int number) {

    List<Rule> rules = Arrays.asList(new Contain3Rule(), new DefaultRule());
    String result = rules.stream()
        .filter(rule -> rule.isMatchRule(number))
        .map(rule -> rule.getReturnForRule(number))
        .collect(Collectors.joining());
    if (!result.equals("")) {
      return result;
    }
    return String.valueOf(number);
  }
}
