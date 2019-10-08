package hackerrank_java;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Strings {

  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    usernameRegex();
    sc.close();
  }

  //TODO: finish Strings from here
  private static void usernameRegex() {

  }

  private static void regex() {

    while (sc.hasNext()) {
      String IP = sc.next();
      System.out.println(IP.matches(new MyRegex().pattern));
    }
  }

  static class MyRegex {

    String num = "(\\d{1,2}|([01])\\d{2}|2[0-4]\\d|25[0-5])";
    String pattern = num + "\\." + num + "\\." + num + "\\." + num;
  }

  private static void patternSyntChecker() {

    int testCases = Integer.parseInt(sc.nextLine());

    while (testCases > 0) {
      String pattern = sc.nextLine();

      try {
        Pattern.compile(pattern);
        System.out.println("Valid");

      } catch (PatternSyntaxException e) {
        System.out.println("Invalid");
      }

      testCases--;
    }
  }

  private static void stringTokens() {
    String s = sc.nextLine();

    if (s.length() == 0) {
      System.out.println("0");
      return;
    }

    if (s.length() > 400000) {
      return;
    }

    String[] mas = s.split("[^A-Za-z]+");

    System.out.println(mas.length);

    for (String str : mas) {
      System.out.println(str);
    }
  }

  //TODO: write sorting algorithm for hackerrank_java
  private static void anagrams() {
    String a = sc.next();
    String b = sc.next();

    char[] amas = a.toCharArray();
    char[] bmas = b.toCharArray();

    Arrays.sort(amas);
    Arrays.sort(bmas);

    boolean ret = Arrays.equals(amas, bmas);
    System.out.println((ret) ? "Anagrams" : "Not Anagrams");
  }

  private static void stringReverse() {
    String A = sc.next();
    boolean no = false;

    for (int i = 0; i < A.length() / 2; i++) {
      if (A.charAt(i) != A.charAt(A.length() - i - 1)) {
        no = true;
        break;
      }
    }

    System.out.println(no ? "No" : "Yes");
  }

  private static String substringComparision(String s, int k) {
    String smallest = s;
    String largest = "";

    for (int i = 0; i < s.length() - k + 1; i++) {
      String sub = s.substring(i, i + k);

      largest = sub.compareTo(largest) > 0 ? sub : largest;
      smallest = sub.compareTo(smallest) < 0 ? sub : smallest;
    }
    return smallest + "\n" + largest;
  }

  private static void subString() {
    String S = sc.next();
    int start = sc.nextInt();
    int end = sc.nextInt();

    System.out.println(S.substring(start, end));
  }

  private static void stringIntro() {
    String A = sc.next();
    String B = sc.next();

    System.out.println(A.length() + B.length());

    if (A.compareTo(B) > 0) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }

    A = A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase();
    B = B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase();

    System.out.println(A + " " + B);
  }


}
