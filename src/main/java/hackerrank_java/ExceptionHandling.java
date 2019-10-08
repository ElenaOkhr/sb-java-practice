package hackerrank_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

  private static final Scanner scanner = new Scanner(System.in);
  private static final MyCalculator my_calculator = new MyCalculator();

  public static void main(String[] args) {

    scanner.close();
  }

  private static void tryCatch() {
    try {
      int x = scanner.nextInt();
      int y = scanner.nextInt();

      System.out.println(x / y);
    } catch (InputMismatchException ime) {
      System.out.println(ime.getClass().getCanonicalName());

    } catch (ArithmeticException ae) {
      System.out.println(ae.toString());
    }
  }

  private static void handlingException() {
    while (scanner.hasNextInt()) {
      int n = scanner.nextInt();
      int p = scanner.nextInt();

      try {
        System.out.println(my_calculator.power(n, p));
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}

class MyCalculator {

  long power(int n, int p) throws Exception {

    if (n < 0 || p < 0) {
      throw new Exception("n or p should not be negative.");
    }

    if (n == 0 && p == 0) {
      throw new Exception("n and p should not be zero.");
    }

    return (long) Math.pow(n, p);
  }
}


