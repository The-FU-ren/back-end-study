package experiment.test;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.ArrayList;

public class testfclass {
  public static void main(String[] args) {
    BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
    System.out.println(add.apply(10, 5));

  }

  @FunctionalInterface
  interface Calculator {
    int calculate(int a, int b);
  }

  Calculator add = (a, b) -> a + b;
  Calculator subtract = (a, b) -> a - b;
  Calculator multiply = (a, b) -> a * b;
  Calculator divide = (a, b) -> a / b;

}
