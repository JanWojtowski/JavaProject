package com.example.javaproject;

public class Storage {
    private int centralModule;
    private int barrackModule;
    private int engineModule;
    private int gunModule;
    private int miningModule;
    private int shieldModule;

    public Storage(){
        this.centralModule = 5;
        this.barrackModule = 5;
        this.engineModule = 5;
        this.gunModule = 5;
        this.miningModule = 5;
        this.shieldModule = 5;
    }

    public void refillStorage(){
        centralModule = 5;
        barrackModule = 5;
        engineModule = 5;
        gunModule = 5;
        miningModule = 5;
        shieldModule = 5;
    }

    public void PutBackCentralModule(){
        centralModule++;
    }

    public boolean TakeCentralModule(){
        if(centralModule > 0){
            centralModule--;
            return true;
        }
        else {
            return false;
        }
    }

    public void PutBackBarrackModule(){
        barrackModule++;
    }

    public boolean TakeBarrackModule(){
        if(barrackModule > 0){
            barrackModule--;
            return true;
        }
        else {
            return false;
        }
    }

    public void PutBackEngineModule(){
        engineModule++;
    }

    public boolean TakeEngineModule(){
        if(engineModule > 0){
            engineModule--;
            return true;
        }
        else {
            return false;
        }
    }

    public void PutBackGunModule(){
        gunModule++;
    }

    public boolean TakeGunModule(){
        if(gunModule > 0){
            gunModule--;
            return true;
        }
        else {
            return false;
        }
    }

    public void PutBackMiningModule(){
        miningModule++;
    }

    public boolean TakeMiningModule(){
        if(miningModule > 0){
            miningModule--;
            return true;
        }
        else {
            return false;
        }
    }

    public void PutBackShieldModule(){
        shieldModule++;
    }

    public boolean TakeShieldModule(){
        if(shieldModule > 0){
            shieldModule--;
            return true;
        }
        else {
            return false;
        }
    }

}
