public class Storage {
	private String[] cells=new String[200];
	private int inPos=1,outPos=1;
	private int count;
	public synchronized void put(int num, int sleepSecond) {
		try {
			while(count==cells.length) {
				this.wait();
			}
			cells[inPos]=String.valueOf(num);
			System.out.println("��cells["+inPos+"]�û���¼---"+cells[inPos]);
			inPos++;
			if(inPos++==cells.length) {
				inPos=0;
			}
			count++;
			System.out.println("���ڹ���"+count+"λ�û�---����");
			Thread.sleep(sleepSecond);
			this.notify();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
public synchronized void get(int sleepSecond) {
	try {
		while(count==0) {
			this.wait();
		}
		String tianTian="a";
		System.out.println("��cells["+outPos+"]��***�û�ע��"+cells[inPos]);
		cells[outPos]=tianTian;
		outPos++;
		if(outPos++==cells.length) {
			outPos=0;
		}
		count++;
		System.out.println("���ڹ���"+count+"λ�û�---������");
		Thread.sleep(sleepSecond);
		this.notify();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}