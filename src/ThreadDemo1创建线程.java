
public class ThreadDemo1创建线程 {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread(); //创建线程
		
		/**
		 * 创建线程：
		 * 	1、继承Thread类
		 * 	2、实现tunnable接口
		 */
		MyThread mt1= new MyThread();
		mt1.start();
		mt1.setPriority(4);
		MyThread1 mt2 = new MyThread1();
		Thread t = new Thread(mt2,"线程2");
		t.start();//mt2这个线程没有start方法，创建一个实例将mt2传进线程
		
	}
}
class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=100000;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	
}
class MyThread1 implements Runnable{
	@Override
	public void run(){
		for(int i=0;i<=100000;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
