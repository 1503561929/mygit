public class FactoryMethod{
  public static void main(String args[]){
    IFactory bigfactory;
    bigfactory = new SmallFactory();
    bigfactory.produce().run();
    bigfactory = new BigFactory();
    bigfactory.produce().run();
  }
}
interface MeizuPhone{
  void run();
}
class PRO5 implements MeizuPhone{
  public void run(){
    System.out.println("我是一台PRO5");
  }
}
class MX5 implements MeizuPhone{
  public void run(){
    System.out.println("我是一台MX5");
  }
}
interface IFactory{
  MeizuPhone produce();
}
class BigFactory implements IFactory{
  public MeizuPhone produce(){
    return new PRO5();
  }
}
class SmallFactory implements IFactory{
  public MeizuPhone produce(){
    return new MX5();
  }
}
