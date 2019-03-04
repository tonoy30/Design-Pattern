package com.tonoy.command_pattern.invoker;

import com.tonoy.command_pattern.receiver.Device;
import com.tonoy.command_pattern.receiver.Television;

public class TVRemote {
    public static Device getDevice() {
        return new Television();
    }
}
