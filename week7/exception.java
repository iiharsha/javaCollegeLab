import java.util.Scanner;

public class exception {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.println("Enter num1: ");
      String input1 = sc.nextLine();
      int num1 = Integer.parseInt(input1);
      System.out.println("Enter num2: ");
      String input2 = sc.nextLine();
      int num2 = Integer.parseInt(input2);
      if (num2 == 0) {
        throw new ArithmeticException("num2 can't be zero");
      }
      System.out.println("num1/num2 = " + (num1 / num2));
    } catch (NumberFormatException e) {
      System.out.println("NumberFormatException: Please enter valid integer for num1 and num2");
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException: " + e.getMessage());
    }
  }
}
