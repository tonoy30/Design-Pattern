package com.tonoy.command_pattern.command;

import com.tonoy.command_pattern.receiver.Device;

public class TurnOff implements Command {
    Device device;

    public TurnOff(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }

    @Override
    public void undo() {
        device.on();
    }
}
