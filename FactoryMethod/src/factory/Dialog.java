package factory;

import button.Button;

/**
 *
 * @author zhanggeng
 * @date 2021/8/9 17:27
 */
public abstract class Dialog {
    public void renderWindow(){
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
