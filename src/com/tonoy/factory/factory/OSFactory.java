package com.tonoy.factory.factory;

import com.tonoy.factory.phone.Android;
import com.tonoy.factory.phone.IOS;
import com.tonoy.factory.phone.Windows;
import com.tonoy.factory.phone.raw.OS;

public class OSFactory {
    public OS getInstance(String osName) {
        if (osName.equalsIgnoreCase("android")) {
            return new Android();
        } else if (osName.equalsIgnoreCase("ios")) {
            return new IOS();
        } else {
            return new Windows();
        }
    }
}
