class MyThread extends Thread {
  public void run() {
    for (int i = 0; i < 4; i++) {
      System.out.println(currentThread().getName() + " is executing...");
    }
  }
}

class Multithread2 {
  public static void main(String[] args) throws InterruptedException {
    MyThread t1 = new MyThread();
    t1.setName("Venue Thread");
    MyThread t2 = new MyThread();
    t2.setName("Cards Thread");
    MyThread t3 = new MyThread();
    t3.setName("Distribution Thread");
    t1.start();
    t1.join();
    t2.start();
    t2.join();
    t3.start();
    t3.join();
  }
}
