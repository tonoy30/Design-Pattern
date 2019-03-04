package com.tonoy.command_pattern.client;

import com.tonoy.command_pattern.command.TurnOff;
import com.tonoy.command_pattern.command.TurnOn;
import com.tonoy.command_pattern.command.TurnVolumeUp;
import com.tonoy.command_pattern.invoker.Buttons;
import com.tonoy.command_pattern.invoker.TVRemote;
import com.tonoy.command_pattern.receiver.Device;

public class PlayWithRemote {
    public static void main(String[] args) {
        // get device to use
        Device tv = TVRemote.getDevice();
        TurnOn turn_on = new TurnOn(tv);
        Buttons turn_on_button = new Buttons(turn_on);
        turn_on_button.press();
        TurnVolumeUp up = new TurnVolumeUp(tv);
        Buttons volume_up_button = new Buttons(up);
        volume_up_button.press();
        volume_up_button.undoPress();
        TurnOff off = new TurnOff(tv);
        Buttons turn_off_button = new Buttons(off);
        turn_off_button.press();
    }
}
