package com.tonoy.factory.phone;

import com.tonoy.factory.phone.raw.OS;

public class Windows implements OS {
    @Override
    public void spec() {
        System.out.println("Fucked by Android and IOS.");
    }
}
