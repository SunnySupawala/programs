package com.in.dependency;

public class Laptop {

    public String getHardDrive()
    {
        return new Hitachi().getHardDrive();

    }

}
