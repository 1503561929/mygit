public class Note1 {
                  public static void main(String[] args){
                      Paper quantity=new  Paper();
                       new Thread(quantity,"第一辆").start();
                       new Thread(quantity,"第二辆").start();
                       new Thread(quantity,"第三辆").start();
                       new Thread(quantity,"第四辆").start();
                       new Thread(quantity,"第五辆").start();
}
}
class Paper implements Runnable{
                       private int ticketpaper=100;
                       public void run(){
                       while(true){
                       if(ticketpaper>0){
                       Thread teacher=Thread.currentThread();
                       String teacher_name=teacher.getName();
                       System.out.println(teacher_name+"正在发第"+ticketpaper--+"个人");
}
}
}
}