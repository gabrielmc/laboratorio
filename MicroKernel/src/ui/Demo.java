/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import center.interfaces.ICore;
import center.impl.Core;
import interfaces.*;


public class Demo {
    
    private IDBController dataBase;
    private IPluginController plugin;    
    private IUIController uiView;

    public void createPet(ICore core){
        this.uiView = core.createUi();
        this.uiView.doUIController();
        this.plugin = core.createPlugin();
        this.plugin.doPluginController();
        this.dataBase = core.createDataBase();
        this.dataBase.doDBController();
    }
    
    public static void main(String[] args){
        new Demo().createPet(new Core());
    }
    
}
