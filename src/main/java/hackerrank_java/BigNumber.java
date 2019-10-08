package hackerrank_java;

import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    scanner.close();
  }

  private static void bigInteger() {

    BigInteger a = new BigInteger(scanner.nextLine());
    BigInteger b = new BigInteger(scanner.nextLine());

    System.out.println(a.add(b));
    System.out.println(a.multiply(b));
  }

  private static void primarilityTest() {

    String n = scanner.nextLine();
    BigInteger bin = new BigInteger(n);

    if (bin.isProbablePrime(1)) {
      System.out.println("prime");
    }
    else {
      System.out.println("not prime");
    }
  }

  private static void bigDecimal() {

    int n = scanner.nextInt();
    String[] s = new String[n + 2];

    for (int i = 0; i < n; i++) {
      s[i] = scanner.next();
    }

    //TODO: sort it

    for (int i = 0; i < n; i++) {
      System.out.println(s[i]);
    }
  }
}