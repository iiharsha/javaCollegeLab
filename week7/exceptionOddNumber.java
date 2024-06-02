public class exceptionOddNumber {

  public static void main(String[] args) {
    int n = 12;
    trynumber(n);
    n = 5;
    trynumber(n);
  }

  public static void trynumber(int n) {
    try {
      checkEvenNumber(n);
      System.out.println(n + "is a even number");
    } catch (IllegalArgumentException e) {
      System.out.println("Error" + e.getMessage());
    }
  }

  public static void checkEvenNumber(int num) {
    if (num % 2 != 0) {
      throw new IllegalArgumentException(num + " is a odd number");
    }
  }
}
