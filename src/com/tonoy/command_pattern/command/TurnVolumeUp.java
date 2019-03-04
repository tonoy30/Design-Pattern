package com.tonoy.command_pattern.command;

import com.tonoy.command_pattern.receiver.Device;

public class TurnVolumeUp implements Command {

    Device device;

    public TurnVolumeUp(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }

    @Override
    public void undo() {
        device.volumeDown();
    }
}
