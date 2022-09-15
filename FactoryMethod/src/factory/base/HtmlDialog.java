package factory.base;

import factory.Dialog;
import factory.interfaces.IButton;
import services.HtmlButton;

/**
 * @author gmuniz
 */
public class HtmlDialog extends Dialog {

    @Override
    public IButton createButton() {
        return new HtmlButton();
    }
}