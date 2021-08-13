import singleton.SingletonMultiThread;
import singleton.SingletonSingleThread;

/**
 * @author zhanggeng
 * @date 2021/8/10 9:38
 */
public class Main {

    public static void main(String[] args)
    {
        System.out.println("--- single thread singleton test ---");
        SingletonSingleThread singleton = SingletonSingleThread.getInstance("first singleton");
        SingletonSingleThread anotherSingleton = SingletonSingleThread.getInstance("another singleton");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);

        System.out.println("--- single thread singleton test ---");
        for(int i=0;i<5;i++)
        {
            MyThread myThread = new MyThread(String.valueOf(i));
            new Thread(myThread).start();
        }
    }

    static class MyThread extends Thread{
        private String index;
        public MyThread(String index)
        {
            this.index = index;
        }
        @Override
        public void run() {
            SingletonMultiThread singleton = SingletonMultiThread.getInstance(index);
            System.out.println(singleton.value);
        }
    }
}
