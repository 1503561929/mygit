public class Student {
	public static void main (String[] args) {
		System.out.println("1�����ѧ����Ϣ------------");
		add();
		System.out.println("2��ɾ��ѧ����Ϣ------------");
		remove();
		System.out.println("3���޸�ѧ����Ϣ------------");
		alter();
	}
 public static void add() {
	 StringBuffer ming=new StringBuffer();
	 ming.append("������");
	 System.out.println("append��ӽ��:"+ming);
	 ming.insert(0, 184805023);
	 System.out.println("insert��ӽ����"+ming);
 }
 public static void remove() {
	 StringBuffer ming=new StringBuffer("������");
	 ming.delete(0, 5);
	 System.out.println("ɾ��ָ��λ�ý��:"+ming);
     ming.delete(0, ming.length());
	 System.out.println("��ջ��������:"+ming);
 }
 public static void alter() {
	 StringBuffer ming=new StringBuffer("������");
	 ming.replace(0,5,"Ԭ־��");
	 System.out.println("�滻ָ��λ���ַ����������:"+ming);
	 System.out.println("�ַ�����ת���:"+ming.reverse());
 }
}
