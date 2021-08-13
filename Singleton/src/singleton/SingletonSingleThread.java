package singleton;

/**
 * @author zhanggeng
 * @date 2021/8/10 9:33
 */
public class SingletonSingleThread {
    private static SingletonSingleThread instance = null;
    public String value;

    private SingletonSingleThread(String value)
    {
        // other code
        this.value = value;
        System.out.println("single thread singleton created");
    }

    public static SingletonSingleThread getInstance(String value)
    {
        if(instance==null)
        {
            instance = new SingletonSingleThread(value);
        }
        return instance;
    }
}
