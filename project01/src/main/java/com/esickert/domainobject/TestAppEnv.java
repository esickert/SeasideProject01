package com.esickert.domainobject;

/**
 * Created by esickert on 12/19/2016.
 */
public class TestAppEnv {
    public static final String DOMAIN = "192.123.0.3";
    public static final String PORT = "67";

    public static String getUrl() {   //the highlighted classes on the left mean they are not commited to github yet.
        return "http://" + DOMAIN + ":" + PORT; //this does NOT cause an error to occur when using null!!
    }
}
//this is very cool in that we call the class name, NOT an instance, followed by the method.
// We didn't need to create an instance of the class because it's static.
//NOTE also that we need to import the package into the test package