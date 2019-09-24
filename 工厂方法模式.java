 public interface Human{ 
        public void getColor();
        public void talk();
  }

    public class BlackHuman implements Human{
        public void getColor(){
            System.out.println("黑色人种的皮肤颜色是黑色的！");
        }
        public void talk(){
            System.out.println("黑人会说话，一般人听不懂！");
        }
    }
    public class YellowHuman implements Human{
        public void getColor(){
            System.out.println("黄色人种的皮肤颜色是黄色的！");
        }
        public void talk(){
            System.out.println("黄色人种会说话，一般说的 都是双字节！");
        }
    }
    public class WhiteHuman implements Human{
        public void getColor(){
            System.out.println("白色人种的皮肤颜色是白色的！");
        }
        public void talk(){
            System.out.println("白色人种会说话，一般都是单字节！");
        }
    }
pubic class NvWa{
        public static void main(String[] args){
            AbstractHumanFactory YinYangLu = new HumanFactory();
            System.out.println("造出来的第一批人是白色人种");
            Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
            whiteHuman.getColor();
            whiteHuman.talk();
    	    System.out.println("造出的第二批人是黑色人种");
            Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
            blackHuman.getColor();
            blackHuman.talk();
    	    System.out.println("造出的第三批人是黄色人种");
            Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);
            yellowHuman.getColor();
            yellowHuman.talk();
        }
    }
