package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  static int[] fizzes = {6, 18, 33};
  static int[] buzzes = {10, 25, 55};
  static int[] fizzBuzzes = {15, 45, 60};
  static int[] neithers = {11, 28, 77};

  @Test
  void fizzBuzz_fizz() {
    for (int value : fizzes) {
      assertEquals("Fizz", FizzBuzz.fizzBuzz(value));
    }

  }

  @Test
  void fizzBuzz_buzz() {
    for (int value : buzzes) {
      assertEquals("Buzz", FizzBuzz.fizzBuzz(value));
    }
  }
  @Test
  void  fizzBuzz_fizzBuzz() {
    for (int value : fizzBuzzes) {
      assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(value));
    }
  }
  @Test
  void fizzBuzz_neither() {
    for (int value : neithers) {
      assertEquals(String.valueOf(value), FizzBuzz.fizzBuzz(value));
    }
  }

}