package com.tavisca;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloWorld {

    @Test
    public void helloworld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.testMethod();
        Assert.assertEquals(1, 1);
    }
}
