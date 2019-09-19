package com.capgemini.se_track;

import java.util.Date;

public class Singleton {

    private static Singleton instance = null;

    private Singleton() { }

    public static Singleton getInstance() {
        if(instance == null) {
            System.out.println("creating a new instance");

            instance = new Singleton();
        }

        return instance;
    }

}
