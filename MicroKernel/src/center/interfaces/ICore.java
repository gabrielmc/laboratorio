package center.interfaces;

import interfaces.IDBController;
import interfaces.IPluginController;
import interfaces.IUIController;

public interface ICore {
    public IUIController createUi();
    public IDBController createDataBase();
    public IPluginController createPlugin();
}