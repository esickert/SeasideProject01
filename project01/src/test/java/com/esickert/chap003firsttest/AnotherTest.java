package com.esickert.chap003firsttest;

import org.junit.*;  //NOTE * being used here!
import static org.junit.Assert.assertEquals;  //correct package for assert.

/**
 * Created by esickert on 12/7/2016.
 */
public class AnotherTest  {

    FirstTest test = new FirstTest();

    @Test
    public void letsTest()  {
        //okay this is cool. This works!!
        test.simpleOutputTest();
    }

    @Test
    public void usingAssert() throws Exception   {
        int sum = 5 + 4;
        byte x = 20;
        assertEquals("this should check the sum of 5+4", 9,sum);
    }


    @Test
    public void checkingIntValue()  {  //this worked ...strange.
        Integer num2 = new Integer(5);
        assertEquals("Are they equal??", 5, num2.intValue());
    }

    @Test
    public void convertToHex()  {
       assertEquals("11 to hex is b", "b", Integer.toHexString(11));
       assertEquals("10 to hex is a", "a", Integer.toHexString(10));
       assertEquals("3 to hex is 3", "3", Integer.toHexString(3));
       assertEquals("21 to hex is 15","15", Integer.toHexString(21));

    }


    }
