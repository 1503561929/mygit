package factory;
import meizuphone.*;
import factory.*;
public class SmallFactory implements IFactory{
  public MeizuPhone produce(){
    return new MX5();
  }
}