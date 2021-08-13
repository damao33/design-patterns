package factory;

import button.Button;
import checkbox.CheckBox;

/**
 * 抽象工厂
 *
 * @author zhanggeng
 * @date 2021/8/9 16:52
 */
public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
