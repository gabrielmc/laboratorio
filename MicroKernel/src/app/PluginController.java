package app;

import interfaces.IPluginController;

public class PluginController implements IPluginController {

    @Override
    public void doPluginController() {
        System.out.println("Waiting for the PluginController to be created !!");
    }
}