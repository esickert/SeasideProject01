package com.esickert.domainobject;

/**
 * Created by esickert on 12/19/2016.
 */
public class TestAppEnv {
    public static String getUrl() {   //the highlighted classes on the left mean they are not commited to github yet.
        return null; //this does NOT cause an error to occur when using null!!
    }
}
//this is very cool in that we call the class name, NOT an instance, followed by the method.
// We didn't need to create an instance of the class because it's static.