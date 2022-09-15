package app;

import interfaces.IUIController;

public class UIController implements IUIController {

    @Override
    public void doUIController() {
        System.out.println("Waiting for the UIController to be created !!");
    }
}