package com.tonoy.builder;

public class Shop {
    public static void main(String[] args) {
        /*Phone phone = new Phone("Android", 2, "intel", 5.5, 4000);
        System.out.println(phone);*/
        Phone phone = new PhoneBuilder().setOs("Android").getPhone();
        System.out.println(phone);
    }


}
