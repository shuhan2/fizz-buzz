import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

  @Test
  void should_return_1_when_transform_given_1() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    String output = fizzBuzz.transform(1);

    assertEquals("1", output);
  }
}