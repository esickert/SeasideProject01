package com.esickert.chap005testwithourownclasses.domainobject.examples;

import com.esickert.domainobject.TestAppEnv;
import org.junit.Test;

/**
 * Created by esickert on 12/19/2016.
 */
public class TestAppEnviromentTest {  //remember this in package domainobject.examples
    @Test
    public void getUrlStatistically(){
        TestAppEnv.getUrl();  //sooo this is a class.method.
    }

}
