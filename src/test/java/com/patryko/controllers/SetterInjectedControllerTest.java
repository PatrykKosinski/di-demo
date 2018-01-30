package com.patryko.controllers;

import com.patryko.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jt on 5/24/17.
 */
public class SetterInjectedControllerTest {

    private GetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectedController = new GetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
    }
}