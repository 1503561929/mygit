public class Note1 {
                  public static void main(String[] args){
                      Paper quantity=new  Paper();
                       new Thread(quantity,"��һ��").start();
                       new Thread(quantity,"�ڶ���").start();
                       new Thread(quantity,"������").start();
                       new Thread(quantity,"������").start();
                       new Thread(quantity,"������").start();
}
}
class Paper implements Runnable{
                       private int ticketpaper=100;
                       public void run(){
                       while(true){
                       if(ticketpaper>0){
                       Thread teacher=Thread.currentThread();
                       String teacher_name=teacher.getName();
                       System.out.println(teacher_name+"���ڷ���"+ticketpaper--+"����");
}
}
}
}