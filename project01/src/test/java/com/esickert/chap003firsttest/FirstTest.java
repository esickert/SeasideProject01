package com.esickert.chap003firsttest;

import org.junit.Test;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

/**
 * Created by esickert on 12/1/2016.
 */

public class FirstTest {
    @Test
    public void addTwoNumbers() {
        int answer = 2 + 3;
        assertEquals("Did it pass?? 2 + 3 = 5", 5, answer);
    }  //end of addTwoNumbers

    @Test
    public void subtractTwoNumbers()    {
        int answer = 5 - 2;
        assertEquals("5-2=3 correct??",3,answer);
    }//end of subtractTwoNumbers

    @Test
    public void multipleTwoNumbers()   {
        int answer = 5 * 4;
        assertEquals("5*4",20,answer);
    } //end of multipleTwoNumbers

    @Test    //remember that @Test is part of the method. compiler flag??
     public void TestSelenium() throws Exception {    //note "exception" is capitalized
        WebDriver test = new FirefoxDriver();
        test.get("http://www.google.com");
        sleep(5000);
        test.quit();
    } // end of selenium test


        protected void simpleOutputTest()    {
            System.out.println("The bride of Frankenstein");
        }

}  //end of FirstTest
