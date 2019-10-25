/**
 * 线程的分类以及运行特性
 * 1、父线程:主线程会等待所有子线程执行完之后再终结执行（守护的子线程例外）
 * 2、子线程：
 * 3、精灵线程（守护线程）
 * @author LJY
 *
 */
public class ThreadDemo3线程的分类 {
	public static void main(String[] args) throws InterruptedException {
		//匿名线程类：后面接{}的线程叫做匿名类
//		Thread t1 = new Thread();//这不是一个匿名类
		Thread t1 = new Thread() {
			public void run(){
				for(int i=0;i<100;i++) {
					System.out.println(Thread.currentThread().getName()+":"+i);
				}
			}
		};

		t1.setDaemon(true);
		t1.start();
		Thread.sleep(2);
		System.out.println("主线程的代码执行完毕lelellelelelleleelel");
	}
}
