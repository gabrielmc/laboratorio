package app;

import interfaces.IDBController;

public class DBController implements IDBController {

    @Override
    public void doDBController() {
        System.out.println("Waiting for the DBController to be created !!");
    }
}