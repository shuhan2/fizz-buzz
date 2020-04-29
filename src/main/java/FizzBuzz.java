import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

  public String transform(int number) {

    List<Rule> rules = Arrays.asList(new Contain5Rule(), new Contain3Rule(), new DefaultRule());
    String result = rules.stream()
        .filter(rule -> rule.isMatchRule(number))
        .findFirst()
        .orElse(new DefaultRule())
        .getReturnForRule(number);
    if (!result.equals("")) {
      return result;
    }
    return String.valueOf(number);
  }
}
