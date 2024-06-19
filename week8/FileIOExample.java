import java.io.*;

public class FileIOExample {

  public static void main(String[] args) throws Exception {
    InputStream is = new FileInputStream("sample.txt");
    OutputStream os = new FileOutputStream("sample2.txt");
    int c;
    while ((c = is.read()) != -1) {
      System.out.print((char) c);
      os.write(c);
    }
    is.close();
    os.close();
  }
}
