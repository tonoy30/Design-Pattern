package com.tonoy.adapter;

import com.tonoy.adapter.tonoy.PilotPen;

public class PenAdapter implements Pen {
    PilotPen pilotPen = new PilotPen();

    @Override
    public void write(String string) {
        pilotPen.write(string);
    }
}
