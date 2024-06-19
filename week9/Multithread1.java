import java.util.Random;

import javax.swing.SpringLayout;

class Thread1 extends Thread {
  public void run() {
    Random r = new Random();
    for (int j = 0; j < 10; j++) {
      int i = r.nextInt(100);
      if (i % 2 == 0) {
        Thread2 t2 = new Thread2(i);
        t2.start();
      } else {
        Thread3 t3 = new Thread3(i);
        t3.start();
      }
    }
  }
}

class Thread2 extends Thread {
  int i;

  Thread2(int i) {
    this.i = i;
  }

  public void run() {
    System.out.println(i + " Square value: " + (i * i));
  }
}

class Thread3 extends Thread {
  int i;

  Thread3(int i) {
    this.i = i;
  }

  public void run() {
    System.out.println(i + " Cube value : " + (i * i * i));
  }
}

class Multithread1 {
  public static void main(String[] args) {
    Thread1 t1 = new Thread1();
    t1.start();
  }
}
