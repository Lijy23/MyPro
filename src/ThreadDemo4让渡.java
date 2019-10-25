
public class ThreadDemo4让渡 {
	public static void main(String[] args) {
		new Thread("多线程") {
			public void run() {
				long start =System.currentTimeMillis();
				for(int i=0;i<1000;i++) {
					Math.random();
				}
				long time = System.currentTimeMillis()-start;
				System.out.println(Thread.currentThread().getName()+":"+time);
			}
		}.start();
		new Thread("小线程") {
			public void run() {
				long start =System.currentTimeMillis();
				for(int i=0;i<1000;i++) {
					Math.random();
					//zhixing执行让渡
					Thread.yield();
				}
				long time = System.currentTimeMillis()-start;
				System.out.println(Thread.currentThread().getName()+":"+time);
			}
		}.start();
		
//		多线程：2
//		小县城：1
//		第一个总是比第二个用的时间稍微多一点，这种i显效叫做让渡
	}
}
