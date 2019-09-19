package com.capgemini.se_track;


import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        waitForInput();
    }

    private static void waitForInput() {
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
