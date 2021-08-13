package app;

import button.Button;
import checkbox.CheckBox;
import factory.GUIFactory;

/**
 * @author zhanggeng
 * @date 2021/8/9 17:00
 */
public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory guiFactory){
        button = guiFactory.createButton();
        checkBox = guiFactory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkBox.paint();
    }
}
