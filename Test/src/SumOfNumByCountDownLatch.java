


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class SumOfNumByCountDownLatch {

 List<Integer> list = new ArrayList<Integer>();

// CountDownLatch countDownLatch = new CountDownLatch(3);

 SumOfNumByCountDownLatch() {

 Thread t1 =  new Thread(new Calculator(1, 2));
 t1.start();
 Thread t2 =  new Thread(new Calculator(3, 4));
 t2.start();
 Thread t3 =  new Thread(new Calculator(5, 6));
 t3.start();

/*  try {
   countDownLatch.await();
  } catch (InterruptedException e) {
   e.printStackTrace();
  }
*/
 try {
 t1.join();
 t2.join();
 t3.join();
 } catch (InterruptedException e) {
	   e.printStackTrace();
	  }
  int totalSum = 0;
  for (Integer count : list) {
   totalSum += count;
  }
  System.out.println(totalSum);
 }

 public static void main(String[] args) {
  new SumOfNumByCountDownLatch();
 }

 class Calculator implements Runnable {
  private int b = 0;
  private int e = 0;

  public Calculator(int b, int e) {
   this.b = b;
   this.e = e;
  }

  @Override
  public void run() {
   int sum = 0;
   for (int i = b; i <= e; i++) {
    sum += i;
   }
   list.add(sum);

//   countDownLatch.countDown();
  }

 }

}