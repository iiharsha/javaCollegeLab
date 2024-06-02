import javax.swing.SpringLayout;

public class multipleCatch {
  public static void main(String[] args) {
    try {
      int n = 10;
      n = 10 / 0;
      int arr[] = new int[6];
      arr[7] = 20;
      String str = null;
      System.out.println(str.length());
      System.out.println("I am in try block");
    } catch (ArithmeticException e) {
      System.out.println("Divided by zero not possible, illegal operation in java");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Accesing array elements outside of specifies limit");
    } catch (NullPointerException e) {
      System.out.println("Null Pointer Error");
    }
    System.out.println("I am try-catch block");

  }

}
