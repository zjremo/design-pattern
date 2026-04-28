package net.jrz;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );

        Thread t1 = new Thread(() -> {
            int cnt = 1;
            while (true){
                System.out.println("这是第 " + cnt + " 次打印, 当前时间: " + System.currentTimeMillis());

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace(System.out);
                }
                ++cnt;
            }
        }, "t1");

        t1.setDaemon(true);
        t1.start();

        // 主线程自旋2s
        long start = System.currentTimeMillis();
        while (true) {
            long cur = System.currentTimeMillis();
            if (cur - start >= 2000) {
                System.out.printf("%s运行完结", Thread.currentThread().getName());
                break;
            }
        }
    }
}
