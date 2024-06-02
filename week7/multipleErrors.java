public class multipleErrors {
  public static void main(String[] args) {
    try {
      int n = 10;
      n = 10 / 0;
      int arr[] = new int[6];
      arr[7] = 20;
      String str = null;
      System.out.println(str.length());
      System.out.println("I am in try block");
    } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
      System.out.println("ArithmeticException");
      System.out.println("ArrayIndexOutOfBoundsException");
      System.out.println("NullPointerException");
    }
    System.out.println("I am from try-catch block");
  }

}
