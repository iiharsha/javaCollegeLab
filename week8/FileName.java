import java.io.*;
import java.util.*;

class FileName {
  public static void main(String[] args) {
    System.out.println("Enter the File Name: ");
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    File f1 = new File(name);
    if (f1.exists()) {
      System.out.println("Name of the file: " + f1.getName());
      if (f1.canRead()) {
        System.out.println("File is readable");
      } else {
        System.out.println("File is not readable");
      }
      if (f1.canWrite()) {
        System.out.println("File is writable");
        System.out.println("The length of the File is: " + f1.length());
      } else {
        System.out.println("File is not writable");
        System.out.println("The length of the File is: " + f1.length());
      }
    } else {
      System.out.println("The file does not exits");
    }
  }
}
