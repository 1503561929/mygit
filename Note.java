public class Note {
                  public static void main(String[] args){
                       Paper quantity=new Paper();
                       new Thread(quantity,"王老师").start();
                       new Thread(quantity,"李老师").start();
                       new Thread(quantity,"张老师").start();
}
}
class Paper implements Runnable{
                       private int ticketpaper=80;
                       public void run(){
                       while(true){
                       if(ticketpaper>0){
                       Thread teacher=Thread.currentThread();
                       String teacher_name=teacher.getName();
                       System.out.println(teacher_name+"正在发第"+ticketpaper--+"份试卷");
}
}
}
}