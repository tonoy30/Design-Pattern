package com.tonoy.command_pattern.command;

import com.tonoy.command_pattern.receiver.Device;

public class TurnOn implements Command {
    Device device;

    public TurnOn(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
}
