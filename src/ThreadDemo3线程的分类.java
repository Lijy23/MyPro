/**
 * �̵߳ķ����Լ���������
 * 1�����߳�:���̻߳�ȴ��������߳�ִ����֮�����ս�ִ�У��ػ������߳����⣩
 * 2�����̣߳�
 * 3�������̣߳��ػ��̣߳�
 * @author LJY
 *
 */
public class ThreadDemo3�̵߳ķ��� {
	public static void main(String[] args) throws InterruptedException {
		//�����߳��ࣺ�����{}���߳̽���������
//		Thread t1 = new Thread();//�ⲻ��һ��������
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
		System.out.println("���̵߳Ĵ���ִ�����lelellelelelleleelel");
	}
}
