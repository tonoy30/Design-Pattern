package com.tonoy.factory.buyer_room;

import com.tonoy.factory.factory.OSFactory;

public class Main {
    public static void main(String[] args) {
        OSFactory osFactory = new OSFactory();
        osFactory.getInstance("is").spec();
    }
}
