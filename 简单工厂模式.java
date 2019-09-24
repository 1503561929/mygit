package factory;
public class Test1 {
              interface Product{
                    public void work() ;
              }
              static class Phone implements Product{
                        public void work() {
                                     System.out.println("�ֻ���ʼ����");
	}
	}

                    static class Computer implements Product{
                    public void work() {
                            System.out.println("���Կ�ʼ����");
              }
        }
              static class ProductFactory{
                      public static Product getProduct(String name) {
                              if("phone".equals(name)) {
                                         return new Phone();
                                }else if("computer".equals(name)) {
                                   return new Computer();
                                }else {
                            return null;
                         }
             }
    }
                  public static void main(String[] args) {
                   Product phone = ProductFactory.getProduct("phone");
                if(null!=phone) {
                phone.work();
               }
      }
}