
public class ThreadDemo2�߳����� {
	public static void main(String[] args) throws InterruptedException {
		//�½�һ�����߳�
		Thread mainThreat  = Thread.currentThread();
		
		//�̵߳�����
		System.out.println("�̵߳�id(Ψһ����"+mainThreat.getId());
		System.out.println("�߳�����"+mainThreat.getName());
		System.out.println("�̵߳����ȼ���10��ߣ�1��ͣ�5Ĭ�ϣ���"+mainThreat.getPriority());
	/*	System.out.println("�߳��ǹ��ػ��̣߳������̣߳�"+mainThreat.isDaemon());
		System.out.println("�߳��Ƿ��ڻ״̬��"+mainThreat.isAlive());
		System.out.println("�߳��ǹ������ж�״̬��"+mainThreat.isInterrupted());*/
		
		//���ߣ���λ��ms���룩
		Thread.sleep(1000);
		
		System.out.println("�߳��ǹ��ػ��̣߳������̣߳�"+mainThreat.isDaemon());
		System.out.println("�߳��Ƿ��ڻ״̬��"+mainThreat.isAlive());
		System.out.println("�߳��ǹ������ж�״̬��"+mainThreat.isInterrupted());
		
	}
}
