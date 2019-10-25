
public class ThreadDemo5_join {
	public static void main(String[] args){
	Thread t =	new Thread("多线程") {
			public void run() {
				for(int i=0;i<50;i++) {
					System.out.println(Thread.currentThread().getName()+":"+i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+":"+i);
				}
			}
		};
		Thread t1 =	new Thread("wobuaixiedaima") {
			public void run() {
				for(int i=0;i<50;i++) {
					try {
						if(i==25) {
							t.join();
						}
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+":"+i);
				}
			}
		};
		t.start();
		t1.start();
	}
}
