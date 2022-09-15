package factory;

import factory.interfaces.IButton;

/**
 * @author gmuniz
 */
public abstract class Dialog {

    public void renderWindow() {
        IButton okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract IButton createButton();
}
