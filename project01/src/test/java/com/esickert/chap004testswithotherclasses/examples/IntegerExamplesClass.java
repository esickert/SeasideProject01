package com.esickert.chap004testswithotherclasses.examples;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.Thread.sleep;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by esickert on 12/5/2016.
 */
public class IntegerExamplesClass {

    @Test
    public void integerExploration()    {
     Integer six = new Integer(6);
     assertEquals("intValue returns int 6",6, six.intValue());

     Integer five = new Integer("6");  //s: is string
     assertEquals("intValue returns int 5", 6, five.intValue());

     Integer four = 4;  //Integer is a class, not a primitive. Don't understand!!!!!!!!!!!
     assertEquals("autoboxing assignmaent for 4.'new' not needed",4, four.intValue());
//***********************************************************************************************
        //this is the assignment for chapter 4
     assertEquals("converting 11 to hex", "b", Integer.toHexString(11));
     //note that toHexString converts int to hexidecimal. it is a method of Integer

     assertEquals("convert 10 to hex", "a", Integer.toHexString(10));

     assertEquals("convert 3 to hex", "3", Integer.toHexString(3));

     assertEquals("convert 21 to hex", "15", Integer.toHexString(21));
    }


    @Test
    public void TestSelenium() throws Exception {
// NOTE: this doesn't close the Webpage
//      for(int i = 1; i <= 10; i++) {
          WebDriver driver = new FirefoxDriver();
          driver.get("http://www.bing.com");
//         try {
            sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
          driver.quit();
//      }//end of for loop
     } //end of TestSelenium



}
