package center.impl;

import app.DBController;
import app.PluginController;
import app.UIController;
import center.interfaces.ICore;
import interfaces.*;

public class Core implements ICore{

    @Override
    public IUIController createUi() {
        return new UIController();
    }

    @Override
    public IDBController createDataBase() {
        return new DBController();
    }

    @Override
    public IPluginController createPlugin() {
        return new PluginController();
    }
}