class MyThread2 extends Thread {
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Multithreading is executing...");
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}

class demo {
  public static void main(String[] args) {
    MyThread2 t = new MyThread2();
    t.start();
    t.setName("foobar");
    t.setPriority(7);
    System.out.println("Thread Name: " + t.getName());
    System.out.println("Thread Priority: " + t.getPriority());
  }
}
