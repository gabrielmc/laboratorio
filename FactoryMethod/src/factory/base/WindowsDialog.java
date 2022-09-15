package factory.base;

import factory.Dialog;
import factory.interfaces.IButton;
import services.WindowsButton;

/**
 * @author gmuniz
 */
public class WindowsDialog extends Dialog {

    @Override
    public IButton createButton() {
        return new WindowsButton();
    }
}