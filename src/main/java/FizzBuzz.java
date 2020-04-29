import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzz {

  public String transform(int number) {

    List<Rule> rules = Arrays.asList(new Multiple3Rule(), new Multiple5Rule(), new Multiple7Rule());
    String collect = rules.stream()
        .map(rule -> rule.getReturnForRule(number))
        .collect(Collectors.joining(""));
    if (!collect.equals("")) {
      return collect;
    }
    return String.valueOf(number);
  }
}
