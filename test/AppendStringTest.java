package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppendStringTest {
    AppendString obj;
    @Before
    public void setUp() throws Exception {
        obj = new AppendString();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void strMatcher() {
        assertEquals("Namitatatata",obj.appendString("Nami","ta",5));
    }
}