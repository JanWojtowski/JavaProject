package com.example.javaproject;

import Modules.BarrackModule;

public class Test {
    public static void main(String[] args) {
        SpaceShip spaceShip = new SpaceShip();
        spaceShip.addModule(new BarrackModule());
        System.out.println(spaceShip);
        spaceShip.removeModule(new BarrackModule());
        System.out.println(spaceShip);
    }
}
