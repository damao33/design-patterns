package factory;

import button.Button;
import button.MacOSButton;
import checkbox.CheckBox;
import checkbox.MacOSCheckBox;

/**
 * 具体工厂
 *
 * @author zhanggeng
 * @date 2021/8/9 16:55
 */
public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
