import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

  @ParameterizedTest
  @CsvSource({
      "'1', 1, 'should return original string value when transform given no special number'",
      "'Fizz', 6, 'should return Fizz when transform given number only multiple 3'",
      "'Buzz', 10, 'should return Buzz when transform given number only multiple 5'",
      "'Whizz', 14, 'should return Buzz when transform given number only multiple 7'"
  })
  void should_return_1_when_transform_given_1(String output, int number) {
    FizzBuzz fizzBuzz = new FizzBuzz();

    assertEquals(output, fizzBuzz.transform(number));
  }
}