package com.example.javaproject;

import Modules.*;
import javafx.fxml.FXML;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class SpaceshipCreatorController {
    Storage storage = new Storage();
    SpaceShip spaceShip1;
    SpaceShip spaceShip2;
    SpaceShip spaceShip3;
    SpaceShip spaceShip4;
    SpaceShip spaceShip5;

    CentralModule templateCentralModule = new CentralModule();
    BarrackModule templateBarrackModule = new BarrackModule();
    EngineModule templateEngineModule = new EngineModule();
    GunModule templateGunModule = new GunModule();
    MiningModule templateMiningModule = new MiningModule();
    ShieldModule templateShieldModule = new ShieldModule();
    StorageModule templateStorageModule = new StorageModule();

    @FXML
    private Label hangarShip1;
    @FXML
    private Label hangarShip2;
    @FXML
    private Label hangarShip3;
    @FXML
    private Label hangarShip4;
    @FXML
    private Label hangarShip5;

    @FXML
    private Label warehouse;

    @FXML
    private Accordion spaceshipAccordion1;
    @FXML
    private Button ship1CreateButton;
    @FXML
    private Label centralModuleLabel1;
    @FXML
    private Label barrackModuleLabel1;
    @FXML
    private Label engineModuleLabel1;
    @FXML
    private Label gunModuleLabel1;
    @FXML
    private Label miningModuleLabel1;
    @FXML
    private Label shieldModuleLabel1;
    @FXML
    private Label storageModuleLabel1;

    @FXML
    private Accordion spaceshipAccordion2;
    @FXML
    private Button ship2CreateButton;
    @FXML
    private Label centralModuleLabel2;
    @FXML
    private Label barrackModuleLabel2;
    @FXML
    private Label engineModuleLabel2;
    @FXML
    private Label gunModuleLabel2;
    @FXML
    private Label miningModuleLabel2;
    @FXML
    private Label shieldModuleLabel2;
    @FXML
    private Label storageModuleLabel2;

    @FXML
    private Accordion spaceshipAccordion3;
    @FXML
    private Button ship3CreateButton;
    @FXML
    private Label centralModuleLabel3;
    @FXML
    private Label barrackModuleLabel3;
    @FXML
    private Label engineModuleLabel3;
    @FXML
    private Label gunModuleLabel3;
    @FXML
    private Label miningModuleLabel3;
    @FXML
    private Label shieldModuleLabel3;
    @FXML
    private Label storageModuleLabel3;

    @FXML
    private Accordion spaceshipAccordion4;
    @FXML
    private Button ship4CreateButton;
    @FXML
    private Label centralModuleLabel4;
    @FXML
    private Label barrackModuleLabel4;
    @FXML
    private Label engineModuleLabel4;
    @FXML
    private Label gunModuleLabel4;
    @FXML
    private Label miningModuleLabel4;
    @FXML
    private Label shieldModuleLabel4;
    @FXML
    private Label storageModuleLabel4;

    @FXML
    private Accordion spaceshipAccordion5;
    @FXML
    private Button ship5CreateButton;
    @FXML
    private Label centralModuleLabel5;
    @FXML
    private Label barrackModuleLabel5;
    @FXML
    private Label engineModuleLabel5;
    @FXML
    private Label gunModuleLabel5;
    @FXML
    private Label miningModuleLabel5;
    @FXML
    private Label shieldModuleLabel5;
    @FXML
    private Label storageModuleLabel5;

    @FXML
    protected void updateHangar(){
        hangarShip1.setText(hangarText(spaceShip1));
        hangarShip2.setText(hangarText(spaceShip2));
        hangarShip3.setText(hangarText(spaceShip3));
        hangarShip4.setText(hangarText(spaceShip4));
        hangarShip5.setText(hangarText(spaceShip5));
    }

    private String hangarText(SpaceShip spaceShip){
        if(spaceShip != null){
            return spaceShip.toString();
        }
        else {
            return "Create spaceship in shipyard";
        }
    }

    @FXML
    protected void updateWarehouse(){
        warehouse.setText(storage.toString());
    }
    @FXML
    protected void restockWarehouse(){
        storage.refillStorage();
        warehouse.setText(storage.toString());
    }

    @FXML
    protected void createShip1Button(){
        if(storage.TakeModule(templateCentralModule)){
            spaceshipAccordion1.setVisible(true);
            ship1CreateButton.setVisible(false);
            spaceShip1 = new SpaceShip("Spaceship nr.1");
        }
        else {
            ship1CreateButton.setText("Not enough central modules in warehouse\n Restock warehouse and click again");
        }
    }

    @FXML
    protected void ship1_Central_disassemble_Button(){
        String temp = spaceShip1.disassembleShip(storage);
        if(temp == null){
            spaceShip1 = null;
            spaceshipAccordion1.setVisible(false);
            ship1CreateButton.setVisible(true);
        }
        else {
            centralModuleLabel1.setText(temp);
        }
    }

    @FXML
    protected void ship1_Central_On_Button(){
        centralModuleLabel1.setText(spaceShip1.turnOnModule(templateCentralModule));
    }

    @FXML
    protected void ship1_Central_Off_Button(){
        centralModuleLabel1.setText(spaceShip1.turnOffModule(templateCentralModule));
    }

    @FXML
    protected void ship1_Central_Status_Button(){
        centralModuleLabel1.setText(spaceShip1.moduleStatus(templateCentralModule));
    }

    @FXML
    protected void ship1_Barrack_Add_Button(){
        barrackModuleLabel1.setText(spaceShip1.addModule(new BarrackModule(),storage));
    }

    @FXML
    protected void ship1_Barrack_On_Button(){
        barrackModuleLabel1.setText(spaceShip1.turnOnModule(templateBarrackModule));
    }

    @FXML
    protected void ship1_Barrack_Off_Button(){
        barrackModuleLabel1.setText(spaceShip1.turnOffModule(templateBarrackModule));
    }

    @FXML
    protected void ship1_Barrack_Remove_Button(){
        barrackModuleLabel1.setText(spaceShip1.removeModule(templateBarrackModule,storage));
    }

    @FXML
    protected void ship1_Barrack_Status_Button(){
        barrackModuleLabel1.setText(spaceShip1.moduleStatus(templateBarrackModule));
    }

    @FXML
    protected void ship1_Engine_Add_Button(){
        engineModuleLabel1.setText(spaceShip1.addModule(new EngineModule(),storage));
    }

    @FXML
    protected void ship1_Engine_On_Button(){
        engineModuleLabel1.setText(spaceShip1.turnOnModule(templateEngineModule));
    }

    @FXML
    protected void ship1_Engine_Off_Button(){
        engineModuleLabel1.setText(spaceShip1.turnOffModule(templateEngineModule));
    }

    @FXML
    protected void ship1_Engine_Remove_Button(){
        engineModuleLabel1.setText(spaceShip1.removeModule(templateEngineModule,storage));
    }

    @FXML
    protected void ship1_Engine_Status_Button(){
        engineModuleLabel1.setText(spaceShip1.moduleStatus(templateEngineModule));
    }

    @FXML
    protected void ship1_Shield_Add_Button(){
        shieldModuleLabel1.setText(spaceShip1.addModule(new ShieldModule(),storage));
    }

    @FXML
    protected void ship1_Shield_On_Button(){
        shieldModuleLabel1.setText(spaceShip1.turnOnModule(templateShieldModule));
    }

    @FXML
    protected void ship1_Shield_Off_Button(){
        shieldModuleLabel1.setText(spaceShip1.turnOffModule(templateShieldModule));
    }

    @FXML
    protected void ship1_Shield_Remove_Button(){
        shieldModuleLabel1.setText(spaceShip1.removeModule(templateShieldModule,storage));
    }

    @FXML
    protected void ship1_Shield_Status_Button(){
        shieldModuleLabel1.setText(spaceShip1.moduleStatus(templateShieldModule));
    }

    @FXML
    protected void ship1_Gun_Add_Button(){
        gunModuleLabel1.setText(spaceShip1.addModule(new GunModule(),storage));
    }

    @FXML
    protected void ship1_Gun_On_Button(){
        gunModuleLabel1.setText(spaceShip1.turnOnModule(templateGunModule));
    }

    @FXML
    protected void ship1_Gun_Off_Button(){
        gunModuleLabel1.setText(spaceShip1.turnOffModule(templateGunModule));
    }

    @FXML
    protected void ship1_Gun_Remove_Button(){
        gunModuleLabel1.setText(spaceShip1.removeModule(templateGunModule,storage));
    }

    @FXML
    protected void ship1_Gun_Status_Button(){
        gunModuleLabel1.setText(spaceShip1.moduleStatus(templateGunModule));
    }

    @FXML
    protected void ship1_Mining_Add_Button(){
        miningModuleLabel1.setText(spaceShip1.addModule(new MiningModule(),storage));
    }

    @FXML
    protected void ship1_Mining_On_Button(){
        miningModuleLabel1.setText(spaceShip1.turnOnModule(templateMiningModule));
    }

    @FXML
    protected void ship1_Mining_Off_Button(){
        miningModuleLabel1.setText(spaceShip1.turnOffModule(templateMiningModule));
    }

    @FXML
    protected void ship1_Mining_Remove_Button(){
        miningModuleLabel1.setText(spaceShip1.removeModule(templateMiningModule,storage));
    }

    @FXML
    protected void ship1_Mining_Status_Button(){
        miningModuleLabel1.setText(spaceShip1.moduleStatus(templateMiningModule));
    }

    @FXML
    protected void ship1_Storage_Add_Button(){
        storageModuleLabel1.setText(spaceShip1.addModule(new StorageModule(),storage));
    }

    @FXML
    protected void ship1_Storage_On_Button(){
        storageModuleLabel1.setText(spaceShip1.turnOnModule(templateStorageModule));
    }

    @FXML
    protected void ship1_Storage_Off_Button(){
        storageModuleLabel1.setText(spaceShip1.turnOffModule(templateStorageModule));
    }

    @FXML
    protected void ship1_Storage_Remove_Button(){
        storageModuleLabel1.setText(spaceShip1.removeModule(templateStorageModule,storage));
    }

    @FXML
    protected void ship1_Storage_Status_Button(){
        storageModuleLabel1.setText(spaceShip1.moduleStatus(templateStorageModule));
    }


///Ship2
    @FXML
    protected void createShip2Button(){
        if(storage.TakeModule(templateCentralModule)){
            spaceshipAccordion2.setVisible(true);
            ship2CreateButton.setVisible(false);
            spaceShip2 = new SpaceShip("Spaceship nr.2");
        }
        else {
            ship2CreateButton.setText("Not enough central modules in warehouse\n Restock warehouse and click again");
        }
    }

    @FXML
    protected void ship2_Central_disassemble_Button(){
        String temp = spaceShip2.disassembleShip(storage);
        if(temp == null){
            spaceShip2 = null;
            spaceshipAccordion2.setVisible(false);
            ship2CreateButton.setVisible(true);
        }
        else {
            centralModuleLabel2.setText(temp);
        }
    }

    @FXML
    protected void ship2_Central_On_Button(){
        centralModuleLabel2.setText(spaceShip2.turnOnModule(templateCentralModule));
    }

    @FXML
    protected void ship2_Central_Off_Button(){
        centralModuleLabel2.setText(spaceShip2.turnOffModule(templateCentralModule));
    }

    @FXML
    protected void ship2_Central_Status_Button(){
        centralModuleLabel2.setText(spaceShip2.moduleStatus(templateCentralModule));
    }

    @FXML
    protected void ship2_Barrack_Add_Button(){
        barrackModuleLabel2.setText(spaceShip2.addModule(new BarrackModule(),storage));
    }

    @FXML
    protected void ship2_Barrack_On_Button(){
        barrackModuleLabel2.setText(spaceShip2.turnOnModule(templateBarrackModule));
    }

    @FXML
    protected void ship2_Barrack_Off_Button(){
        barrackModuleLabel2.setText(spaceShip2.turnOffModule(templateBarrackModule));
    }

    @FXML
    protected void ship2_Barrack_Remove_Button(){
        barrackModuleLabel2.setText(spaceShip2.removeModule(templateBarrackModule,storage));
    }

    @FXML
    protected void ship2_Barrack_Status_Button(){
        barrackModuleLabel2.setText(spaceShip2.moduleStatus(templateBarrackModule));
    }

    @FXML
    protected void ship2_Engine_Add_Button(){
        engineModuleLabel2.setText(spaceShip2.addModule(new EngineModule(),storage));
    }

    @FXML
    protected void ship2_Engine_On_Button(){
        engineModuleLabel2.setText(spaceShip2.turnOnModule(templateEngineModule));
    }

    @FXML
    protected void ship2_Engine_Off_Button(){
        engineModuleLabel2.setText(spaceShip2.turnOffModule(templateEngineModule));
    }

    @FXML
    protected void ship2_Engine_Remove_Button(){
        engineModuleLabel2.setText(spaceShip2.removeModule(templateEngineModule,storage));
    }

    @FXML
    protected void ship2_Engine_Status_Button(){
        engineModuleLabel2.setText(spaceShip2.moduleStatus(templateEngineModule));
    }

    @FXML
    protected void ship2_Shield_Add_Button(){
        shieldModuleLabel2.setText(spaceShip2.addModule(new ShieldModule(),storage));
    }

    @FXML
    protected void ship2_Shield_On_Button(){
        shieldModuleLabel2.setText(spaceShip2.turnOnModule(templateShieldModule));
    }

    @FXML
    protected void ship2_Shield_Off_Button(){
        shieldModuleLabel2.setText(spaceShip2.turnOffModule(templateShieldModule));
    }

    @FXML
    protected void ship2_Shield_Remove_Button(){
        shieldModuleLabel2.setText(spaceShip2.removeModule(templateShieldModule,storage));
    }

    @FXML
    protected void ship2_Shield_Status_Button(){
        shieldModuleLabel2.setText(spaceShip2.moduleStatus(templateShieldModule));
    }

    @FXML
    protected void ship2_Gun_Add_Button(){
        gunModuleLabel2.setText(spaceShip2.addModule(new GunModule(),storage));
    }

    @FXML
    protected void ship2_Gun_On_Button(){
        gunModuleLabel2.setText(spaceShip2.turnOnModule(templateGunModule));
    }

    @FXML
    protected void ship2_Gun_Off_Button(){
        gunModuleLabel2.setText(spaceShip2.turnOffModule(templateGunModule));
    }

    @FXML
    protected void ship2_Gun_Remove_Button(){
        gunModuleLabel2.setText(spaceShip2.removeModule(templateGunModule,storage));
    }

    @FXML
    protected void ship2_Gun_Status_Button(){
        gunModuleLabel2.setText(spaceShip2.moduleStatus(templateGunModule));
    }

    @FXML
    protected void ship2_Mining_Add_Button(){
        miningModuleLabel2.setText(spaceShip2.addModule(new MiningModule(),storage));
    }

    @FXML
    protected void ship2_Mining_On_Button(){
        miningModuleLabel2.setText(spaceShip2.turnOnModule(templateMiningModule));
    }

    @FXML
    protected void ship2_Mining_Off_Button(){
        miningModuleLabel2.setText(spaceShip2.turnOffModule(templateMiningModule));
    }

    @FXML
    protected void ship2_Mining_Remove_Button(){
        miningModuleLabel2.setText(spaceShip2.removeModule(templateMiningModule,storage));
    }

    @FXML
    protected void ship2_Mining_Status_Button(){
        miningModuleLabel2.setText(spaceShip2.moduleStatus(templateMiningModule));
    }

    @FXML
    protected void ship2_Storage_Add_Button(){
        storageModuleLabel2.setText(spaceShip2.addModule(new StorageModule(),storage));
    }

    @FXML
    protected void ship2_Storage_On_Button(){
        storageModuleLabel2.setText(spaceShip2.turnOnModule(templateStorageModule));
    }

    @FXML
    protected void ship2_Storage_Off_Button(){
        storageModuleLabel2.setText(spaceShip2.turnOffModule(templateStorageModule));
    }

    @FXML
    protected void ship2_Storage_Remove_Button(){
        storageModuleLabel2.setText(spaceShip2.removeModule(templateStorageModule,storage));
    }

    @FXML
    protected void ship2_Storage_Status_Button(){
        storageModuleLabel2.setText(spaceShip2.moduleStatus(templateStorageModule));
    }


///Ship3
    @FXML
    protected void createShip3Button(){
        if(storage.TakeModule(templateCentralModule)){
            spaceshipAccordion3.setVisible(true);
            ship3CreateButton.setVisible(false);
            spaceShip3 = new SpaceShip("Spaceship nr.3");
        }
        else {
            ship3CreateButton.setText("Not enough central modules in warehouse\n Restock warehouse and click again");
        }
    }

    @FXML
    protected void ship3_Central_disassemble_Button(){
        String temp = spaceShip3.disassembleShip(storage);
        if(temp == null){
            spaceShip3 = null;
            spaceshipAccordion3.setVisible(false);
            ship3CreateButton.setVisible(true);
        }
        else {
            centralModuleLabel3.setText(temp);
        }
    }

    @FXML
    protected void ship3_Central_On_Button(){
        centralModuleLabel3.setText(spaceShip3.turnOnModule(templateCentralModule));
    }

    @FXML
    protected void ship3_Central_Off_Button(){
        centralModuleLabel3.setText(spaceShip3.turnOffModule(templateCentralModule));
    }

    @FXML
    protected void ship3_Central_Status_Button(){
        centralModuleLabel3.setText(spaceShip3.moduleStatus(templateCentralModule));
    }

    @FXML
    protected void ship3_Barrack_Add_Button(){
        barrackModuleLabel3.setText(spaceShip3.addModule(new BarrackModule(),storage));
    }

    @FXML
    protected void ship3_Barrack_On_Button(){
        barrackModuleLabel3.setText(spaceShip3.turnOnModule(templateBarrackModule));
    }

    @FXML
    protected void ship3_Barrack_Off_Button(){
        barrackModuleLabel3.setText(spaceShip3.turnOffModule(templateBarrackModule));
    }

    @FXML
    protected void ship3_Barrack_Remove_Button(){
        barrackModuleLabel3.setText(spaceShip3.removeModule(templateBarrackModule,storage));
    }

    @FXML
    protected void ship3_Barrack_Status_Button(){
        barrackModuleLabel3.setText(spaceShip3.moduleStatus(templateBarrackModule));
    }

    @FXML
    protected void ship3_Engine_Add_Button(){
        engineModuleLabel3.setText(spaceShip3.addModule(new EngineModule(),storage));
    }

    @FXML
    protected void ship3_Engine_On_Button(){
        engineModuleLabel3.setText(spaceShip3.turnOnModule(templateEngineModule));
    }

    @FXML
    protected void ship3_Engine_Off_Button(){
        engineModuleLabel3.setText(spaceShip3.turnOffModule(templateEngineModule));
    }

    @FXML
    protected void ship3_Engine_Remove_Button(){
        engineModuleLabel3.setText(spaceShip3.removeModule(templateEngineModule,storage));
    }

    @FXML
    protected void ship3_Engine_Status_Button(){
        engineModuleLabel3.setText(spaceShip3.moduleStatus(templateEngineModule));
    }

    @FXML
    protected void ship3_Shield_Add_Button(){
        shieldModuleLabel3.setText(spaceShip3.addModule(new ShieldModule(),storage));
    }

    @FXML
    protected void ship3_Shield_On_Button(){
        shieldModuleLabel3.setText(spaceShip3.turnOnModule(templateShieldModule));
    }

    @FXML
    protected void ship3_Shield_Off_Button(){
        shieldModuleLabel3.setText(spaceShip3.turnOffModule(templateShieldModule));
    }

    @FXML
    protected void ship3_Shield_Remove_Button(){
        shieldModuleLabel3.setText(spaceShip3.removeModule(templateShieldModule,storage));
    }

    @FXML
    protected void ship3_Shield_Status_Button(){
        shieldModuleLabel3.setText(spaceShip3.moduleStatus(templateShieldModule));
    }

    @FXML
    protected void ship3_Gun_Add_Button(){
        gunModuleLabel3.setText(spaceShip3.addModule(new GunModule(),storage));
    }

    @FXML
    protected void ship3_Gun_On_Button(){
        gunModuleLabel3.setText(spaceShip3.turnOnModule(templateGunModule));
    }

    @FXML
    protected void ship3_Gun_Off_Button(){
        gunModuleLabel3.setText(spaceShip3.turnOffModule(templateGunModule));
    }

    @FXML
    protected void ship3_Gun_Remove_Button(){
        gunModuleLabel3.setText(spaceShip3.removeModule(templateGunModule,storage));
    }

    @FXML
    protected void ship3_Gun_Status_Button(){
        gunModuleLabel3.setText(spaceShip3.moduleStatus(templateGunModule));
    }

    @FXML
    protected void ship3_Mining_Add_Button(){
        miningModuleLabel3.setText(spaceShip3.addModule(new MiningModule(),storage));
    }

    @FXML
    protected void ship3_Mining_On_Button(){
        miningModuleLabel3.setText(spaceShip3.turnOnModule(templateMiningModule));
    }

    @FXML
    protected void ship3_Mining_Off_Button(){
        miningModuleLabel3.setText(spaceShip3.turnOffModule(templateMiningModule));
    }

    @FXML
    protected void ship3_Mining_Remove_Button(){
        miningModuleLabel3.setText(spaceShip3.removeModule(templateMiningModule,storage));
    }

    @FXML
    protected void ship3_Mining_Status_Button(){
        miningModuleLabel3.setText(spaceShip3.moduleStatus(templateMiningModule));
    }

    @FXML
    protected void ship3_Storage_Add_Button(){
        storageModuleLabel3.setText(spaceShip3.addModule(new StorageModule(),storage));
    }

    @FXML
    protected void ship3_Storage_On_Button(){
        storageModuleLabel3.setText(spaceShip3.turnOnModule(templateStorageModule));
    }

    @FXML
    protected void ship3_Storage_Off_Button(){
        storageModuleLabel3.setText(spaceShip3.turnOffModule(templateStorageModule));
    }

    @FXML
    protected void ship3_Storage_Remove_Button(){
        storageModuleLabel3.setText(spaceShip3.removeModule(templateStorageModule,storage));
    }

    @FXML
    protected void ship3_Storage_Status_Button(){
        storageModuleLabel3.setText(spaceShip3.moduleStatus(templateStorageModule));
    }
///Ship 4
    @FXML
    protected void createShip4Button(){
        if(storage.TakeModule(templateCentralModule)){
            spaceshipAccordion4.setVisible(true);
            ship4CreateButton.setVisible(false);
            spaceShip4 = new SpaceShip("Spaceship nr.4");
        }
        else {
            ship4CreateButton.setText("Not enough central modules in warehouse\n Restock warehouse and click again");
        }
    }

    @FXML
    protected void ship4_Central_disassemble_Button(){
        String temp = spaceShip4.disassembleShip(storage);
        if(temp == null){
            spaceShip4 = null;
            spaceshipAccordion4.setVisible(false);
            ship4CreateButton.setVisible(true);
        }
        else {
            centralModuleLabel4.setText(temp);
        }
    }

    @FXML
    protected void ship4_Central_On_Button(){
        centralModuleLabel4.setText(spaceShip4.turnOnModule(templateCentralModule));
    }

    @FXML
    protected void ship4_Central_Off_Button(){
        centralModuleLabel4.setText(spaceShip4.turnOffModule(templateCentralModule));
    }

    @FXML
    protected void ship4_Central_Status_Button(){
        centralModuleLabel4.setText(spaceShip4.moduleStatus(templateCentralModule));
    }

    @FXML
    protected void ship4_Barrack_Add_Button(){
        barrackModuleLabel4.setText(spaceShip4.addModule(new BarrackModule(),storage));
    }

    @FXML
    protected void ship4_Barrack_On_Button(){
        barrackModuleLabel4.setText(spaceShip4.turnOnModule(templateBarrackModule));
    }

    @FXML
    protected void ship4_Barrack_Off_Button(){
        barrackModuleLabel4.setText(spaceShip4.turnOffModule(templateBarrackModule));
    }

    @FXML
    protected void ship4_Barrack_Remove_Button(){
        barrackModuleLabel4.setText(spaceShip4.removeModule(templateBarrackModule,storage));
    }

    @FXML
    protected void ship4_Barrack_Status_Button(){
        barrackModuleLabel4.setText(spaceShip4.moduleStatus(templateBarrackModule));
    }

    @FXML
    protected void ship4_Engine_Add_Button(){
        engineModuleLabel4.setText(spaceShip4.addModule(new EngineModule(),storage));
    }

    @FXML
    protected void ship4_Engine_On_Button(){
        engineModuleLabel4.setText(spaceShip4.turnOnModule(templateEngineModule));
    }

    @FXML
    protected void ship4_Engine_Off_Button(){
        engineModuleLabel4.setText(spaceShip4.turnOffModule(templateEngineModule));
    }

    @FXML
    protected void ship4_Engine_Remove_Button(){
        engineModuleLabel4.setText(spaceShip4.removeModule(templateEngineModule,storage));
    }

    @FXML
    protected void ship4_Engine_Status_Button(){
        engineModuleLabel4.setText(spaceShip4.moduleStatus(templateEngineModule));
    }

    @FXML
    protected void ship4_Shield_Add_Button(){
        shieldModuleLabel4.setText(spaceShip4.addModule(new ShieldModule(),storage));
    }

    @FXML
    protected void ship4_Shield_On_Button(){
        shieldModuleLabel4.setText(spaceShip4.turnOnModule(templateShieldModule));
    }

    @FXML
    protected void ship4_Shield_Off_Button(){
        shieldModuleLabel4.setText(spaceShip4.turnOffModule(templateShieldModule));
    }

    @FXML
    protected void ship4_Shield_Remove_Button(){
        shieldModuleLabel4.setText(spaceShip4.removeModule(templateShieldModule,storage));
    }

    @FXML
    protected void ship4_Shield_Status_Button(){
        shieldModuleLabel4.setText(spaceShip4.moduleStatus(templateShieldModule));
    }

    @FXML
    protected void ship4_Gun_Add_Button(){
        gunModuleLabel4.setText(spaceShip4.addModule(new GunModule(),storage));
    }

    @FXML
    protected void ship4_Gun_On_Button(){
        gunModuleLabel4.setText(spaceShip4.turnOnModule(templateGunModule));
    }

    @FXML
    protected void ship4_Gun_Off_Button(){
        gunModuleLabel4.setText(spaceShip4.turnOffModule(templateGunModule));
    }

    @FXML
    protected void ship4_Gun_Remove_Button(){
        gunModuleLabel4.setText(spaceShip4.removeModule(templateGunModule,storage));
    }

    @FXML
    protected void ship4_Gun_Status_Button(){
        gunModuleLabel4.setText(spaceShip4.moduleStatus(templateGunModule));
    }

    @FXML
    protected void ship4_Mining_Add_Button(){
        miningModuleLabel4.setText(spaceShip4.addModule(new MiningModule(),storage));
    }

    @FXML
    protected void ship4_Mining_On_Button(){
        miningModuleLabel4.setText(spaceShip4.turnOnModule(templateMiningModule));
    }

    @FXML
    protected void ship4_Mining_Off_Button(){
        miningModuleLabel4.setText(spaceShip4.turnOffModule(templateMiningModule));
    }

    @FXML
    protected void ship4_Mining_Remove_Button(){
        miningModuleLabel4.setText(spaceShip4.removeModule(templateMiningModule,storage));
    }

    @FXML
    protected void ship4_Mining_Status_Button(){
        miningModuleLabel4.setText(spaceShip4.moduleStatus(templateMiningModule));
    }

    @FXML
    protected void ship4_Storage_Add_Button(){
        storageModuleLabel4.setText(spaceShip4.addModule(new StorageModule(),storage));
    }

    @FXML
    protected void ship4_Storage_On_Button(){
        storageModuleLabel4.setText(spaceShip4.turnOnModule(templateStorageModule));
    }

    @FXML
    protected void ship4_Storage_Off_Button(){
        storageModuleLabel4.setText(spaceShip4.turnOffModule(templateStorageModule));
    }

    @FXML
    protected void ship4_Storage_Remove_Button(){
        storageModuleLabel4.setText(spaceShip4.removeModule(templateStorageModule,storage));
    }

    @FXML
    protected void ship4_Storage_Status_Button(){
        storageModuleLabel4.setText(spaceShip4.moduleStatus(templateStorageModule));
    }


///Ship 5
    @FXML
    protected void createShip5Button(){
        if(storage.TakeModule(templateCentralModule)){
            spaceshipAccordion5.setVisible(true);
            ship5CreateButton.setVisible(false);
            spaceShip5 = new SpaceShip("Spaceship nr.5");
        }
        else {
            ship5CreateButton.setText("Not enough central modules in warehouse\n Restock warehouse and click again");
        }
    }

    @FXML
    protected void ship5_Central_disassemble_Button(){
        String temp = spaceShip5.disassembleShip(storage);
        if(temp == null){
            spaceShip5 = null;
            spaceshipAccordion5.setVisible(false);
            ship5CreateButton.setVisible(true);
        }
        else {
            centralModuleLabel5.setText(temp);
        }
    }

    @FXML
    protected void ship5_Central_On_Button(){
        centralModuleLabel5.setText(spaceShip5.turnOnModule(templateCentralModule));
    }

    @FXML
    protected void ship5_Central_Off_Button(){
        centralModuleLabel5.setText(spaceShip5.turnOffModule(templateCentralModule));
    }

    @FXML
    protected void ship5_Central_Status_Button(){
        centralModuleLabel5.setText(spaceShip5.moduleStatus(templateCentralModule));
    }

    @FXML
    protected void ship5_Barrack_Add_Button(){
        barrackModuleLabel5.setText(spaceShip5.addModule(new BarrackModule(),storage));
    }

    @FXML
    protected void ship5_Barrack_On_Button(){
        barrackModuleLabel5.setText(spaceShip5.turnOnModule(templateBarrackModule));
    }

    @FXML
    protected void ship5_Barrack_Off_Button(){
        barrackModuleLabel5.setText(spaceShip5.turnOffModule(templateBarrackModule));
    }

    @FXML
    protected void ship5_Barrack_Remove_Button(){
        barrackModuleLabel5.setText(spaceShip5.removeModule(templateBarrackModule,storage));
    }

    @FXML
    protected void ship5_Barrack_Status_Button(){
        barrackModuleLabel5.setText(spaceShip5.moduleStatus(templateBarrackModule));
    }

    @FXML
    protected void ship5_Engine_Add_Button(){
        engineModuleLabel5.setText(spaceShip5.addModule(new EngineModule(),storage));
    }

    @FXML
    protected void ship5_Engine_On_Button(){
        engineModuleLabel5.setText(spaceShip5.turnOnModule(templateEngineModule));
    }

    @FXML
    protected void ship5_Engine_Off_Button(){
        engineModuleLabel5.setText(spaceShip5.turnOffModule(templateEngineModule));
    }

    @FXML
    protected void ship5_Engine_Remove_Button(){
        engineModuleLabel5.setText(spaceShip5.removeModule(templateEngineModule,storage));
    }

    @FXML
    protected void ship5_Engine_Status_Button(){
        engineModuleLabel5.setText(spaceShip5.moduleStatus(templateEngineModule));
    }

    @FXML
    protected void ship5_Shield_Add_Button(){
        shieldModuleLabel5.setText(spaceShip5.addModule(new ShieldModule(),storage));
    }

    @FXML
    protected void ship5_Shield_On_Button(){
        shieldModuleLabel5.setText(spaceShip5.turnOnModule(templateShieldModule));
    }

    @FXML
    protected void ship5_Shield_Off_Button(){
        shieldModuleLabel5.setText(spaceShip5.turnOffModule(templateShieldModule));
    }

    @FXML
    protected void ship5_Shield_Remove_Button(){
        shieldModuleLabel5.setText(spaceShip5.removeModule(templateShieldModule,storage));
    }

    @FXML
    protected void ship5_Shield_Status_Button(){
        shieldModuleLabel5.setText(spaceShip5.moduleStatus(templateShieldModule));
    }

    @FXML
    protected void ship5_Gun_Add_Button(){
        gunModuleLabel5.setText(spaceShip5.addModule(new GunModule(),storage));
    }

    @FXML
    protected void ship5_Gun_On_Button(){
        gunModuleLabel5.setText(spaceShip5.turnOnModule(templateGunModule));
    }

    @FXML
    protected void ship5_Gun_Off_Button(){
        gunModuleLabel5.setText(spaceShip5.turnOffModule(templateGunModule));
    }

    @FXML
    protected void ship5_Gun_Remove_Button(){
        gunModuleLabel5.setText(spaceShip5.removeModule(templateGunModule,storage));
    }

    @FXML
    protected void ship5_Gun_Status_Button(){
        gunModuleLabel5.setText(spaceShip5.moduleStatus(templateGunModule));
    }

    @FXML
    protected void ship5_Mining_Add_Button(){
        miningModuleLabel5.setText(spaceShip5.addModule(new MiningModule(),storage));
    }

    @FXML
    protected void ship5_Mining_On_Button(){
        miningModuleLabel5.setText(spaceShip5.turnOnModule(templateMiningModule));
    }

    @FXML
    protected void ship5_Mining_Off_Button(){
        miningModuleLabel5.setText(spaceShip5.turnOffModule(templateMiningModule));
    }

    @FXML
    protected void ship5_Mining_Remove_Button(){
        miningModuleLabel5.setText(spaceShip5.removeModule(templateMiningModule,storage));
    }

    @FXML
    protected void ship5_Mining_Status_Button(){
        miningModuleLabel5.setText(spaceShip5.moduleStatus(templateMiningModule));
    }

    @FXML
    protected void ship5_Storage_Add_Button(){
        storageModuleLabel5.setText(spaceShip5.addModule(new StorageModule(),storage));
    }

    @FXML
    protected void ship5_Storage_On_Button(){
        storageModuleLabel5.setText(spaceShip5.turnOnModule(templateStorageModule));
    }

    @FXML
    protected void ship5_Storage_Off_Button(){
        storageModuleLabel5.setText(spaceShip5.turnOffModule(templateStorageModule));
    }

    @FXML
    protected void ship5_Storage_Remove_Button(){
        storageModuleLabel5.setText(spaceShip5.removeModule(templateStorageModule,storage));
    }

    @FXML
    protected void ship5_Storage_Status_Button(){
        storageModuleLabel5.setText(spaceShip5.moduleStatus(templateStorageModule));
    }
}