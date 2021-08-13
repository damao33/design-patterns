package button;

/**
 * @author zhanggeng
 * @date 2021/8/9 17:25
 */
public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("windows render");
    }

    @Override
    public void onClick() {
        System.out.println("windows onclick");
    }
}
