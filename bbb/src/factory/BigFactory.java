package factory;
import meizuphone.*;
import factory.*;
public class BigFactory implements IFactory{
  public MeizuPhone produce(){
    return new PRO5();
  }
}