import app.Application;
import factory.GUIFactory;
import factory.WindowsFactory;

/**
 * @author zhanggeng
 * @date 2021/8/9 17:04
 */
public class Main {
    public static void main(String[] args){
        Application application;
        GUIFactory guiFactory;

        //todo 判断工厂类型
        guiFactory = new WindowsFactory();
        application = new Application(guiFactory);
        application.paint();
    }
}
