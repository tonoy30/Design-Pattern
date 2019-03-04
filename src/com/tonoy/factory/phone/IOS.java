package com.tonoy.factory.phone;

import com.tonoy.factory.phone.raw.OS;

public class IOS implements OS {
    @Override
    public void spec() {
        System.out.println("Most secure Os in the world.");
    }
}
