package factory;

import button.Button;
import button.HTMLButton;

/**
 * @author zhanggeng
 * @date 2021/8/9 17:30
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
