package factory;

import button.Button;
import button.WindowsButton;

/**
 * @author zhanggeng
 * @date 2021/8/9 17:30
 */
public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
