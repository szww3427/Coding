package com.bupt.ww;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EchoServiceTest {

    @Test
    public void echo() {
        EchoService echoService = new EchoService();
        Assert.assertEquals("123","123",echoService.echo("123"));
        Assert.assertEquals("321","321",echoService.echo("321"));
    }
}