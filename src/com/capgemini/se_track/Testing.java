package com.capgemini.se_track;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Testing {

    @Test
    public void test() {
        assertThat("1", is(1));
    }
}
