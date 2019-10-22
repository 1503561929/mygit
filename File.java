public class File extends Thread {
    public static int sum;
    private int stratNum;
 
    public File(int startNum) {
        this.stratNum = startNum;
    }
 
    public static synchronized void add(int num) {
        sum += num;
    }
 
    public void run() {
        int sum = 0;
 
        for (int i=0; i<10; i++) {
            sum +=  1;
        }
 
        add(sum);
    }
 
    public static void main(String[] args) throws Exception {
        Thread[] threadList = new Thread[10];
 
        for (int i=0; i<10; i++) {
            threadList[i] = new File(1);
            threadList[i].start();
        }
 
        System.out.println("文件下载完成% " +sum);
    }
}
