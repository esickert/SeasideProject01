package com.esickert.chap005testwithourownclasses.domainobject.examples;

import com.esickert.domainobject.TestAppEnv;    //WE ARE IMPORTING FROM AN OUTSIDE PACKAGE. STATIC USAGE
import static com.esickert.domainobject.TestAppEnv.DOMAIN;
import static com.esickert.domainobject.TestAppEnv.getUrl;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * Created by esickert on 12/19/2016.
 */
public class TestAppEnviromentTest {  //remember this in package domainobject.examples
    @Test
    public void canGetUrlStatistically(){
        getUrl();  //TedtAppEnv is a class not object (instance) and getUrl is a static method of it.
        System.out.println(getUrl());
    }

    //There are different methods here for coding the same thing. One called Static Import with the other Staic Usage.
    @Test
    public void canGetDomainAndPortStaticallly()    {
        //Static Import
        Assert.assertEquals("Just the domain:",  //note the addition of Assert before assertEquals
                "192.123.0.3",
                DOMAIN);

        //Static Usage
        assertEquals("Just the port:",
                "67",
                TestAppEnv.PORT);
    }
}
