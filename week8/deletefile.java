import java.io.*;
import java.util.*;

class deletefile {
  public static void main(String[] args) {
    System.out.println("Enter the file name");
    Scanner sc = new Scanner(System.in);
    String fname = sc.next();
    File f = new File(fname);
    if (f.delete()) {
      System.out.println("Deleted the file: " + f.getName());
    } else {
      System.out.println("The file " + f.getName() + " does not exist");
    }
  }
}
