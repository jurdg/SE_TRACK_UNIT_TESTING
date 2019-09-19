package com.capgemini.se_track;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

public class SingletonTest {

    @Before
    public void reflectOnSingletonAndReset() throws NoSuchFieldException, IllegalAccessException {
        Field instance = Singleton.class.getDeclaredField("instance");

        instance.setAccessible(true);

        instance.set(null, null);

        instance.setAccessible(false);
    }

    @Test
    public void firstTest() {
        Singleton s = Singleton.getInstance();
    }

    @Test
    public void secondTest() {
        Singleton s = Singleton.getInstance();
    }
}
