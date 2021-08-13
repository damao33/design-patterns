package button;

/**
 * @author zhanggeng
 * @date 2021/8/9 17:25
 */
public class HTMLButton implements Button{
    @Override
    public void render() {
        System.out.println("html render");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("html onclick");
    }
}
