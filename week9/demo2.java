class Child implements Runnable {
  public void run() {
    System.out.println(Thread.currentThread().getName());
  }
}

class demo2 implements Runnable {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      try {
        Child c = new Child();
        demo2 m = new demo2();
        Thread t1 = new Thread(c);
        t1.setName("Bro");
        Thread t2 = new Thread(m);
        t2.setName("HelloThread");

        t2.start();
        t2.join();
        t1.start();
        t1.join(); // Ensure that t1 finishes before sleeping

        Thread.sleep(3000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public void run() {
    System.out.print("Hello ");
  }
}
