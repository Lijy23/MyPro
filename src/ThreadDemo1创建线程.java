
public class ThreadDemo1�����߳� {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread(); //�����߳�
		
		/**
		 * �����̣߳�
		 * 	1���̳�Thread��
		 * 	2��ʵ��tunnable�ӿ�
		 */
		MyThread mt1= new MyThread();
		mt1.start();
		mt1.setPriority(4);
		MyThread1 mt2 = new MyThread1();
		Thread t = new Thread(mt2,"�߳�2");
		t.start();//mt2����߳�û��start����������һ��ʵ����mt2�����߳�
		
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
