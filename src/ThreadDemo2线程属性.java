
public class ThreadDemo2线程属性 {
	public static void main(String[] args) throws InterruptedException {
		//新建一个主线程
		Thread mainThreat  = Thread.currentThread();
		
		//线程的属性
		System.out.println("线程的id(唯一）："+mainThreat.getId());
		System.out.println("线程名："+mainThreat.getName());
		System.out.println("线程的优先级（10最高，1最低，5默认）："+mainThreat.getPriority());
	/*	System.out.println("线程是够守护线程（精灵线程）"+mainThreat.isDaemon());
		System.out.println("线程是否处于活动状态："+mainThreat.isAlive());
		System.out.println("线程是够处于中断状态："+mainThreat.isInterrupted());*/
		
		//休眠（单位：ms毫秒）
		Thread.sleep(1000);
		
		System.out.println("线程是够守护线程（精灵线程）"+mainThreat.isDaemon());
		System.out.println("线程是否处于活动状态："+mainThreat.isAlive());
		System.out.println("线程是够处于中断状态："+mainThreat.isInterrupted());
		
	}
}
