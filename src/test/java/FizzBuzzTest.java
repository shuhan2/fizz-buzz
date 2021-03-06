import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

  @ParameterizedTest
  @CsvSource({
      "'1', 1, 'should return original string value when transform given no special number'",
      "'Fizz', 6, 'should return Fizz when transform given number only multiple 3'",
      "'Buzz', 10, 'should return Buzz when transform given number only multiple 5'",
      "'Whizz', 14, 'should return Buzz when transform given number only multiple 7'",
      "'FizzBuzzWhizz', 210, 'should return Buzz when transform given number multiple 3、5 and  7'",
      "'Fizz', 13, 'should return Fizz when transform given number only contains 3'",
      "'Fizz', 30, 'should ignore rule for multiple 5 and 7 when transform given number only contains 3'",
      "'BuzzWhizz', 35, 'should ignore rule for contain 3 when transform given number contains 5'",
      "'Fizz', 51, 'should not ignore rule for multiple 3 when transform given number contains 5'",
      "'Fizz', 75, 'should ignore rule for multiple 5 when transform given number contains 7'",
      "'Fizz', 73, 'should not ignore rule for contains 3 when transform given number contains 7'",
  })
  void should_return_output_when_transform_given_number(String output, int number) {
    FizzBuzz fizzBuzz = new FizzBuzz();

    assertEquals(output, fizzBuzz.transform(number));
  }
}