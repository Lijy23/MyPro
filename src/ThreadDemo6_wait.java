import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * 在多线程情况下，可能同时执行某个语句
 * 
 * 
 * 
 * 
 * 
 * 
 * @author LJY
 *
 */
public class ThreadDemo6_wait {
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t1  = new Thread(mr,"线程1");
		Thread t2  = new Thread(mr,"线程2");
		Thread t3  = new Thread(mr,"线程3");
		Thread t4  = new Thread(mr,"线程4");
		Thread t5  = new Thread(mr,"线程5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}

class MyRunnable implements Runnable{
	private int count=5;
	
	//synchronizazed 表示该代码只能同时被一个线程执行
	@Override
	public synchronized void run() {
		if("线程2".equals(Thread.currentThread().getName())) {
			System.out.println("============线程2在此等待===============");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} //这是个object的方法
		}
		System.out.println(Thread.currentThread().getName()+":"+count--);
	}
	
}
