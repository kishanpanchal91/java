import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class SumCyclicBarrier {

 List<Integer> list = new ArrayList<Integer>();

 final CyclicBarrier cyclicBarrier;

 SumCyclicBarrier() {
  cyclicBarrier = new CyclicBarrier(3, new Runnable() {
   @Override
   public void run() {
    int totalSum = 0;
    for (Integer count : list) {
     totalSum += count;
    }
    System.out.println(totalSum);
   }
  });
  
  new Thread(new Calculator(1, 2)).start();
  new Thread(new Calculator(3, 4)).start();
  new Thread(new Calculator(5, 6)).start();
 }

 public static void main(String[] args) {
  new SumCyclicBarrier();
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
	
   try {
    int sum = 0;
    for (int i = b; i <= e; i++) {
     sum += i;
    }
    list.add(sum);

    cyclicBarrier.await();
   } catch (InterruptedException ex) {
    return;
   } catch (BrokenBarrierException ex) {
    return;
   }
  }

 }
}