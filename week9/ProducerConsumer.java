class Buffer {
  private int item;
  private boolean hasItem = false;

  public synchronized void produce(int item) throws InterruptedException {
    while (hasItem) {
      wait();
    }
    this.item = item;
    hasItem = true;
    System.out.println("Produced: " + item);
    notify();
  }

  public synchronized int consume() throws InterruptedException {
    while (!hasItem) {
      wait();
    }
    hasItem = false;
    System.out.println("Consumed: " + item);
    notify();
    return item;
  }
}

class Producer implements Runnable {
  private Buffer buffer;

  public Producer(Buffer buffer) {
    this.buffer = buffer;
  }

  public void run() {
    try {
      for (int i = 0; i < 10; i++) {
        buffer.produce(i);
        Thread.sleep(500); // Simulate time taken to produce an item
      }
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }
}

class Consumer implements Runnable {
  private Buffer buffer;

  public Consumer(Buffer buffer) {
    this.buffer = buffer;
  }

  public void run() {
    try {
      for (int i = 0; i < 11; i++) {
        buffer.consume();
        Thread.sleep(1000); // Simulate time taken to consume an item
      }
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }
}

public class ProducerConsumer {
  public static void main(String[] args) {
    Buffer buffer = new Buffer();
    Thread producerThread = new Thread(new Producer(buffer));
    Thread consumerThread = new Thread(new Consumer(buffer));

    producerThread.start();
    consumerThread.start();

    try {
      producerThread.join();
      consumerThread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
