package singleton;

/**
 * @author zhanggeng
 * @date 2021/8/10 9:33
 */
public class SingletonMultiThread {
    /**
     * volatile防止指令重排序
     */
    private static volatile SingletonMultiThread instance = null;
    public String value;

    private SingletonMultiThread(String value)
    {
        // other code
        this.value = value;
        System.out.println("multi thread singleton created");
    }

    /**
     * 给方法加synchronized太重
     *
     * @param value
     * @return
     */
    /*public static synchronized SingletonMultiThread getInstance(String value)
    {
        if(instance==null)
        {
            instance = new SingletonMultiThread(value);
        }
        return instance;
    }*/

    /**
     * DLC双端检索，会有指令重排序导致获得的instance没有实例化出错的问题
     *
     * @param value
     * @return
     */
    /*public static synchronized SingletonMultiThread getInstance(String value)
    {
        if(instance==null)
        {
            synchronized (SingletonMultiThread.class)
            {
                if(instance == null)
                {
                    instance = new SingletonMultiThread(value);
                }
            }
        }
        return instance;
    }*/

    /**
     * DLC双端检索+volatile防止指令重排序
     * @param value
     * @return
     */
    public static synchronized SingletonMultiThread getInstance(String value)
    {
        if(instance==null)
        {
            synchronized (SingletonMultiThread.class)
            {
                if(instance == null)
                {
                    instance = new SingletonMultiThread(value);
                }
            }
        }
        return instance;
    }
}
