package com.campusdual.classroom;

public class TVRemote {

    int volume;
    int channel = 0;

    String color;

    Boolean on =false;

    public TVRemote(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public void channelUp(){
        this.channel++;

    }

    public void channelDown(){
        if (this.channel > 0){
            this.channel--;
        }

    }

    public void volumeUp(){
        this.volume++;

    }

    public void volumeDown(){
        if (this.volume > 0){
            this.volume--;
        }

    }

}
