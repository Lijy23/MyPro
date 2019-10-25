import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * �ڶ��߳�����£�����ͬʱִ��ĳ�����
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
		Thread t1  = new Thread(mr,"�߳�1");
		Thread t2  = new Thread(mr,"�߳�2");
		Thread t3  = new Thread(mr,"�߳�3");
		Thread t4  = new Thread(mr,"�߳�4");
		Thread t5  = new Thread(mr,"�߳�5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}

class MyRunnable implements Runnable{
	private int count=5;
	
	//synchronizazed ��ʾ�ô���ֻ��ͬʱ��һ���߳�ִ��
	@Override
	public synchronized void run() {
		if("�߳�2".equals(Thread.currentThread().getName())) {
			System.out.println("============�߳�2�ڴ˵ȴ�===============");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			} //���Ǹ�object�ķ���
		}
		System.out.println(Thread.currentThread().getName()+":"+count--);
	}
	
}
