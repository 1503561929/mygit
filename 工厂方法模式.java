 public interface Human{ 
        public void getColor();
        public void talk();
  }

    public class BlackHuman implements Human{
        public void getColor(){
            System.out.println("��ɫ���ֵ�Ƥ����ɫ�Ǻ�ɫ�ģ�");
        }
        public void talk(){
            System.out.println("���˻�˵����һ������������");
        }
    }
    public class YellowHuman implements Human{
        public void getColor(){
            System.out.println("��ɫ���ֵ�Ƥ����ɫ�ǻ�ɫ�ģ�");
        }
        public void talk(){
            System.out.println("��ɫ���ֻ�˵����һ��˵�� ����˫�ֽڣ�");
        }
    }
    public class WhiteHuman implements Human{
        public void getColor(){
            System.out.println("��ɫ���ֵ�Ƥ����ɫ�ǰ�ɫ�ģ�");
        }
        public void talk(){
            System.out.println("��ɫ���ֻ�˵����һ�㶼�ǵ��ֽڣ�");
        }
    }
pubic class NvWa{
        public static void main(String[] args){
            AbstractHumanFactory YinYangLu = new HumanFactory();
            System.out.println("������ĵ�һ�����ǰ�ɫ����");
            Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
            whiteHuman.getColor();
            whiteHuman.talk();
    	    System.out.println("����ĵڶ������Ǻ�ɫ����");
            Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
            blackHuman.getColor();
            blackHuman.talk();
    	    System.out.println("����ĵ��������ǻ�ɫ����");
            Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);
            yellowHuman.getColor();
            yellowHuman.talk();
        }
    }
