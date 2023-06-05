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

    public String addModule(Module module,Storage storage){
        if(spaceShip.contains(module)){
            return module.getName() + " is already attached";
        }
        else {
            if(storage.TakeModule(module)){
                spaceShip.add(module);
                return module.getName() + " has been added";
            }
            else {
                return "Not enough " + module.getName() + " in storage";
            }
        }
    }

    public String removeModule(Module module,Storage storage){
        if(module.getStatus()){
            return "You must turn off module before removing it";
        }
        else {
            spaceShip.remove(module);
            storage.PutBackModule(module);
            return "Module successfully removed";
        }
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