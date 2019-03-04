package com.tonoy.command_pattern.invoker;

import com.tonoy.command_pattern.command.Command;

public class Buttons implements Button {
    Command command;

    public Buttons(Command command) {
        this.command = command;
    }

    @Override
    public void press() {
        command.execute();
    }

    @Override
    public void undoPress() {
        command.undo();
    }
}
