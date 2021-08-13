package factory;

import button.Button;
import button.WindowsButton;
import checkbox.CheckBox;
import checkbox.WindowsCheckBox;

/**
 * 具体工厂
 *
 * @author zhanggeng
 * @date 2021/8/9 16:56
 */
public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
