package Modules;

import java.util.Objects;

public abstract class Module {
    private boolean status;
    private String name;

    public Module(String name){
        this.name = name;
        this.status = false;
    }
    public String turnOn(){
        if(!this.status){
            this.status = true;
            return "Module turned on";
        }
        else {
            return "Module already on";
        }
    }

    public String turnOff(){
        if(this.status){
            this.status = false;
            return "Module turned off";
        }
        else {
            return "Module already off";
        }
    }

    public boolean getStatus(){
        return status;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        stringBuilder.append(name);
        stringBuilder.append(" Status: ");
        if(status){
            stringBuilder.append("Online");
        }
        else{
            stringBuilder.append("Offline");
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Module module)) return false;
        return Objects.equals(name, module.name);
    }

}
