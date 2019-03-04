package com.tonoy.command_pattern.receiver;

import com.tonoy.command_pattern.receiver.Device;

/*
 * reciver
*/
public class Television implements Device {

    private int volume = 0;

    @Override
    public void on() {
        System.out.println("Tv is ON.");
    }

    @Override
    public void off() {
        System.out.println("Tv is OFF.");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("TV volume is at " + volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("TV volume is at " + volume);
    }
}
