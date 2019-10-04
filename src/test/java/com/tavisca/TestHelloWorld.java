package com.tavisca;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloWorld {

    @Test
    public void helloShouldReturnHelloWithName() {
        Greet greet = new Greet();
        Assert.assertEquals("must return hello with name", "Hello Pete", greet.hello("Pete"));
    }

    @Test
    public void byeShouldReturnByeWithName() {
        Greet greet = new Greet();
        Assert.assertEquals("must return bye with name", "Bye Pete", greet.bye("Pete"));
    }
}
