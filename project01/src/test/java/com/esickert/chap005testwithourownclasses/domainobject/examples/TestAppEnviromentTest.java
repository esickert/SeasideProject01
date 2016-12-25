package com.esickert.chap005testwithourownclasses.domainobject.examples;

import com.esickert.domainobject.TestAppEnv;   //WE ARE IMPORTING FROM AN OUTSIDE PACKAGE
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by esickert on 12/19/2016.
 */
public class TestAppEnviromentTest {  //remember this in package domainobject.examples
    @Test
    public void getUrlStatistically(){
        TestAppEnv.getUrl();  //TedtAppEnv is a class not object (instance) and getUrl is a static method of it.
        System.out.println(TestAppEnv.getUrl());
    }

    @Test
    public void canGetDomainAndPortStaticallly()    {

        assertEquals("Just the domain:",
                "192.123.0.3",
                TestAppEnv.DOMAIN);

        assertEquals("Just the port:",
                "67",
                TestAppEnv.PORT);
    }
}
