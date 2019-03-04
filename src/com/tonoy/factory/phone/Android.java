package com.tonoy.factory.phone;

import com.tonoy.factory.phone.raw.OS;

public class Android implements OS {
    @Override
    public void spec() {
        System.out.println("Most powerfull OS in the world.");
    }
}
