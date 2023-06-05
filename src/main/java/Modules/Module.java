package Modules;

import java.util.Objects;

public abstract class Module {
    boolean status;
    String name;

    public Module(String name){
        this.name = name;
        this.status = false;
    }
    boolean turnOn(){
        if(!this.status){
            this.status = true;
            return true;
        }
        else {
            return false;
        }
    }

    boolean turnOff(){
        if(this.status){
            this.status = false;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        stringBuilder.append(" Status: ");
        if(status){
            stringBuilder.append("Online");
        }
        else{
            stringBuilder.append("Offline");
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Module module)) return false;
        return Objects.equals(name, module.name);
    }

}
