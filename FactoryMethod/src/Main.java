import factory.Dialog;
import factory.WindowsDialog;

/**
 * @author zhanggeng
 * @date 2021/8/9 17:04
 */
public class Main {
    public static void main(String[] args){
        Dialog dialog = null;

        //todo 判断Dialog工厂类型(Html或Windows)
        dialog = new WindowsDialog();

        dialog.renderWindow();
    }
}
