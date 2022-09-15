package ui;

import factory.Dialog;
import factory.base.*;

/**
 * @author gmuniz
 * Demo class. Everything comes together here.
 */
public class Demo {
    
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        dialog = new WindowsDialog();
        //dialog = new HtmlDialog();
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }    
}