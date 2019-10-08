package hackerrank;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Introduction {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    scanner.close();
  }

  private static void currencyFormatter() {
    double payment = scanner.nextDouble();

    String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
    String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
    String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
    String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);

    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);
  }

  private static String findDay(int month, int day, int year) {

    try {
      String dateString = String.format("%d-%d-%d", year, month, day);
      Date date = new SimpleDateFormat("yyyy-M-d").parse(dateString);

      String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
      return dayOfWeek.toUpperCase();

    } catch (ParseException e) {
      e.printStackTrace();
    }
    return null;
  }

  private static void intToString() {
    int n = scanner.nextInt();
    String s = Integer.toString(n);

    if (n == Integer.parseInt(s)) {
      System.out.println("Good job");
    }
    else {
      System.out.println("Wrong answer.");
    }
  }

  // code for staticInitializer()
 /* private static boolean staticInitializerFlag;
  private static int B, H;

  static {
    if (scanner.hasNext()) {
      B = scanner.nextInt();
      H = scanner.nextInt();
    }

    try {
      if (B <= 0 || H <= 0) {
        throw new Exception("java.lang.Exception: Breadth and height must be positive");
      }
      staticInitializerFlag = true;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  private static void staticInitializer() {

    if(staticInitializerFlag){
      int area=B*H;
      System.out.print(area);
    }
  }*/

  private static void endOfFile() {
    int n = 1;

    while (scanner.hasNext()) {

      String line = scanner.nextLine();
      System.out.println(n + " " + line);
      n++;
    }
  }

  private static void dataTypes() {
    int t = scanner.nextInt();

    for (int i = 0; i < t; i++) {

      try {
        long x = scanner.nextLong();
        System.out.println(x + " can be fitted in:");

        if (x >= -128 && x <= 127) {
          System.out.println("* byte");
        }

        if (x >= -32768 && x <= 32767) {
          System.out.println("* short");
        }

        if (x >= -(int) Math.pow(2, 31) && x <= (int) Math.pow(2, 31) - 1) {
          System.out.println("* int");
        }

        if (x >= -(long) Math.pow(2, 63) && x <= (long) Math.pow(2, 63) - 1) {
          System.out.println("* long");
        }

      } catch (Exception e) {
        System.out.println(scanner.next() + " can't be fitted anywhere.");
      }
    }
  }

  private static void loopTwo() {

    int t = scanner.nextInt();

    for (int i = 0; i < t; i++) {

      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int n = scanner.nextInt();

      for (int j = 0; j < n; j++) {

        a = a + b * (int) Math.pow(2, j);      //?????????????????????????????????????????????
        System.out.print(a + " ");
      }

      System.out.println();
    }
  }

  private static void loopOne() {

    if (!scanner.hasNextInt()) {
      return;
    }

    int N = scanner.nextInt();

    if (N > 20 && N < 2) {
      return;
    }

    for (int i = 1; i < 11; i++) {

      int res = N * i;
      System.out.println(N + " x " + i + " = " + res);
    }
  }

  private static void outputFormating() {

    System.out.println("================================");

    for (int i = 0; i < 3; i++) {

      String s1 = scanner.next();
      int x = scanner.nextInt();

      System.out.printf("%-15s%03d\n", s1, x);
    }
    System.out.println("================================");
  }

  private static void stdInAndOutTwo() {
    // Java Stdin and Stdout II
    int i = scanner.nextInt();
    double d = scanner.nextDouble();
    scanner.nextLine();                 //nextInt() doesn't read "/n" after the number, so we need do skip it
    String s = scanner.nextLine();

    System.out.println("String: " + s);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
  }

  private static void ifElse() {
    // Java If-Else
    if (scanner.hasNextInt()) {

      int n = scanner.nextInt();

      if ((n % 2 != 0) || (n > 5 && n < 21)) {
        System.out.println("Weird");

      }
      else {

        if ((n > 1 && n < 6) || n > 20) {
          System.out.println("Not Weird");
        }
      }
    }
  }

  private static void stdInAndOutOne() {

    for (int i = 0; i < 3; i++) {

      if (scanner.hasNextInt()) {

        int a = scanner.nextInt();
        System.out.println(a);
      }
    }
  }

  private static void javaStdout() {

    System.out.println("Hello, World");
  }

}
