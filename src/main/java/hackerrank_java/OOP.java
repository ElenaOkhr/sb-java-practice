package hackerrank_java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class OOP {

  @SuppressWarnings({"unchecked"})
  private static void iterator() {
    ArrayList mylist = new ArrayList();

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    for (int i = 0; i < n; i++) {
      mylist.add(sc.nextInt());
    }

    mylist.add("###");
    for (int i = 0; i < m; i++) {
      mylist.add(sc.next());
    }

    Iterator it = func(mylist);

    while (it.hasNext()) {

      Object element = it.next();
      System.out.println((String) element);
    }
  }

  private static Iterator func(ArrayList mylist) {
    Iterator it = mylist.iterator();

    while (it.hasNext()) {
      Object element = it.next();
      if (element instanceof String) {
        break;
      }
    }
    return it;
  }

  private static void instanceOfKeyword() {
    ArrayList mylist = new ArrayList();
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      String s = sc.next();

      if (s.equals("Student")) {
        mylist.add(new Student());
      }

      if (s.equals("Rockstar")) {
        mylist.add(new Rockstar());
      }

      if (s.equals("Hacker")) {
        mylist.add(new Hacker());
      }
    }

    System.out.println(count(mylist));
  }

  private static String count(ArrayList mylist) {
    int a = 0;
    int b = 0;
    int c = 0;

    for (int i = 0; i < mylist.size(); i++) {
      Object element = mylist.get(i);

      if (element instanceof Student) {
        a++;
      }

      if (element instanceof Rockstar) {
        b++;
      }

      if (element instanceof Hacker) {
        c++;
      }
    }
    return Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
  }

  private static void methodOverridingTwo() {
    MotorCycle M = new MotorCycle();
  }

  private static void methodOverridingOne() {
    Sports c1 = new Sports();
    Soccer c2 = new Soccer();
    System.out.println(c1.getName());
    c1.getNumberOfTeamMembers();
    System.out.println(c2.getName());
    c2.getNumberOfTeamMembers();
  }

  private static void interFace() {
    MyCalc my_calculator = new MyCalc();

    System.out.print("I implemented: ");
    ImplementedInterfaceNames(my_calculator);

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    System.out.print(my_calculator.divisor_sum(n) + "\n");

    sc.close();
  }

  static void ImplementedInterfaceNames(Object o) {
    Class[] theInterfaces = o.getClass().getInterfaces();

    for (int i = 0; i < theInterfaces.length; i++) {

      String interfaceName = theInterfaces[i].getName();
      System.out.println(interfaceName);
    }
  }

  private static void abstractClass() {
    //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
    Scanner sc = new Scanner(System.in);
    String title = sc.nextLine();

    MyBook new_novel = new MyBook();
    new_novel.setTitle(title);

    System.out.println("The title is: " + new_novel.getTitle());
    sc.close();
  }

  private static void inheritanceTwo() {
    // Create a new Adder object
    Adder a = new Adder();

    // Print the name of the superclass on a new line
    System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

    // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
    System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
  }

  private static void inheritanceOne() {

    Bird bird = new Bird();
    bird.walk();
    bird.fly();
    bird.sing();

  }
}

// InstanceOf keyword
class Student {

}

class Rockstar {

}

class Hacker {

}

// Method Overriding-2
class BiCycle {

  String define_me() {
    return "a vehicle with pedals.";
  }
}

class MotorCycle extends BiCycle {

  @Override
  String define_me() {
    return "a cycle with an engine.";
  }

  MotorCycle() {
    System.out.println("Hello I am a motorcycle, I am " + define_me());

    String temp = super.define_me();

    System.out.println("My ancestor is a cycle who is " + temp);
  }

}

// Method Overriding-1
class Sports {

  String getName() {
    return "Generic Sports";
  }

  void getNumberOfTeamMembers() {
    System.out.println("Each team has n players in " + getName());
  }
}

class Soccer extends Sports {

  @Override
  String getName() {
    return "Soccer Class";
  }

  @Override
  void getNumberOfTeamMembers() {
    System.out.println("Each team has 11 players in " + getName());
  }
}

// Interface
interface AdvancedArithmetic {

  int divisor_sum(int n);
}

class MyCalc implements AdvancedArithmetic {

  public int divisor_sum(int n) {
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        sum = sum + i;
      }
    }

    return sum;
  }
}

// Abstract class
abstract class Book {

  String title;

  abstract void setTitle(String s);

  String getTitle() {
    return title;
  }
}

class MyBook extends Book {

  void setTitle(String s) {
    title = s;
  }
}

// Inheritance-2
class Arithmetic {

  int add(int a, int b) {
    return a + b;
  }
}

class Adder extends Arithmetic {

}

// Inheritance-1
class Animal {

  void walk() {
    System.out.println("I am walking");
  }
}

class Bird extends Animal {

  void fly() {
    System.out.println("I am flying");
  }

  void sing() {
    System.out.println("I am singing");
  }
}
