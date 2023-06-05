package com.example.javaproject;

import Modules.BarrackModule;

public class Test {
    public static void main(String[] args) {
        SpaceShip spaceShip = new SpaceShip();
        Storage storage = new Storage();
        System.out.println(spaceShip.addModule(new BarrackModule(),storage));
        System.out.println(spaceShip);
        System.out.println(storage);
        System.out.println(spaceShip.removeModule(new BarrackModule(),storage));
        System.out.println(spaceShip);
        System.out.println(storage);
    }
}
