package org.lenchikv.first;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by olenushka on 25.11.2015.
 */
public class HelloWordFactoryTest {

    @Test
    public void testFactoryPerfect() throws Exception {
        HelloWorld service = HelloWordFactory.createHelloWorld("pErFect");
        assertEquals(PerfectHelloWorld.class.getSimpleName(), service.getClass().getSimpleName());
    }

    @Test
    public void testFactoryNull() throws Exception {
        HelloWorld service = HelloWordFactory.createHelloWorld(null);
        assertEquals(SimpleHelloWorld.class.getSimpleName(), service.getClass().getSimpleName());
    }

    @Test
    public void testFactoryNotPerfect() throws Exception {
        HelloWorld service = HelloWordFactory.createHelloWorld("perfect2");
        assertEquals(SimpleHelloWorld.class.getSimpleName(), service.getClass().getSimpleName());
    }
}