package com.example.javaproject;

import Modules.CentralModule;
import Modules.Module;

import java.util.ArrayList;
import java.util.List;

public class SpaceShip {
    private String name;
    private List<Module> spaceShip = new ArrayList<>();

    public SpaceShip(String name){
        this.name = name;
        this.spaceShip.add(new CentralModule());
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
        if(spaceShip.contains(module)){
            if(spaceShip.get(spaceShip.indexOf(module)).getStatus()){
                return "You must turn off module before removing it";
            }
            else {
                storage.PutBackModule(module);
                spaceShip.remove(module);
                return "Module successfully removed";
            }
        }
        else {
            return module.getName() + "is not attached.";
        }
    }

    public String turnOnModule(Module module){
        if(spaceShip.contains(module)){
            return spaceShip.get(spaceShip.indexOf(module)).turnOn();
        }
        else {
            return module.getName() + "is not attached.";
        }
    }

    public String turnOffModule(Module module){
        if(spaceShip.contains(module)){
            return spaceShip.get(spaceShip.indexOf(module)).turnOff();
        }
        else {
            return module.getName() + "is not attached.";
        }
    }

    public String moduleStatus(Module module){
        if(spaceShip.contains(module)){
            return spaceShip.get(spaceShip.indexOf(module)).getName() + " is attached. Status: " + spaceShip.get(spaceShip.indexOf(module)).getStringStatus();
        }
        else {
            return module.getName() + "is not attached.";
        }
    }

    public String disassembleShip(Storage storage){
        CentralModule temp = new CentralModule();
        if(spaceShip.size() == 1 && spaceShip.contains(temp)){
            if(spaceShip.get(spaceShip.indexOf(temp)).getStatus()){
                return "You must turn off central module to disassemble the ship";
            }
            else {
                storage.PutBackModule(temp);
                spaceShip.remove(temp);
                return null;
            }
        }
        return "You must remove all modules and turn off central module before disassembling ship";
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        temp.append(name);
        temp.append("\n");
        temp.append("Installed modules:\n");
        for (Module module: spaceShip) {
            temp.append("\t");
            temp.append(module.toString());
        }
        return temp.toString();
    }
}