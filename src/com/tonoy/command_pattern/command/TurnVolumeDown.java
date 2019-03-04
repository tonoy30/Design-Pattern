package com.tonoy.command_pattern.command;

import com.tonoy.command_pattern.receiver.Device;

public class TurnVolumeDown implements Command {
    Device device;

    public TurnVolumeDown(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }

    @Override
    public void undo() {
        device.volumeUp();
    }
}
