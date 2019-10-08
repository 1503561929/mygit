import factory.*;
import meizuphone.*;
public class FactoryMethod{
  public static void main(String args[]){
    IFactory bigfactory;
    bigfactory = new SmallFactory();
    bigfactory.produce().run();
    bigfactory = new BigFactory();
    bigfactory.produce().run();
  }
}