package com.tonoy.adapter;

public class School {
    public static void main(String[] args) {
        Pen pen = new PenAdapter();
        Assignment assignment = new Assignment();
        assignment.setPen(pen);
        assignment.writeAssignment("I'm  bit tired to write assignment.");
    }
}
