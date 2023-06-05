package com.example.javaproject;

import Modules.CentralModule;
import Modules.Module;
import com.example.javaproject.Storage;

import java.util.ArrayList;
import java.util.List;

public class SpaceShip {
    private List<Module> spaceShip = new ArrayList<>();

    public SpaceShip(){
        spaceShip.add(new CentralModule());
    }

    public void addModule(Module module){
        spaceShip.add(module);

    }

    public void removeModule(Module module,Storage storage){
        spaceShip.remove(module);
    }
    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (Module module: spaceShip) {
            temp.append(module.toString());
        }
        return temp.toString();
    }
}