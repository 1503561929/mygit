public class Note {
                  public static void main(String[] args){
                       Paper quantity=new Paper();
                       new Thread(quantity,"����ʦ").start();
                       new Thread(quantity,"����ʦ").start();
                       new Thread(quantity,"����ʦ").start();
}
}
class Paper implements Runnable{
                       private int ticketpaper=80;
                       public void run(){
                       while(true){
                       if(ticketpaper>0){
                       Thread teacher=Thread.currentThread();
                       String teacher_name=teacher.getName();
                       System.out.println(teacher_name+"���ڷ���"+ticketpaper--+"���Ծ�");
}
}
}
}