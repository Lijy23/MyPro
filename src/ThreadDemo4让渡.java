
public class ThreadDemo4�ö� {
	public static void main(String[] args) {
		new Thread("���߳�") {
			public void run() {
				long start =System.currentTimeMillis();
				for(int i=0;i<1000;i++) {
					Math.random();
				}
				long time = System.currentTimeMillis()-start;
				System.out.println(Thread.currentThread().getName()+":"+time);
			}
		}.start();
		new Thread("С�߳�") {
			public void run() {
				long start =System.currentTimeMillis();
				for(int i=0;i<1000;i++) {
					Math.random();
					//zhixingִ���ö�
					Thread.yield();
				}
				long time = System.currentTimeMillis()-start;
				System.out.println(Thread.currentThread().getName()+":"+time);
			}
		}.start();
		
//		���̣߳�2
//		С�سǣ�1
//		��һ�����Ǳȵڶ����õ�ʱ����΢��һ�㣬����i��Ч�����ö�
	}
}
