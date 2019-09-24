package introduction;

import java.util.Scanner;

public class Introduction {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    scanner.close();
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

    for (int i=0; i<3; i++) {

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
