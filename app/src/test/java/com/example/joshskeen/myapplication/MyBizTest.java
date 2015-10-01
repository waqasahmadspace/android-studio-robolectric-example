package com.example.joshskeen.myapplication;



/**
 * Created by waqas on 9/30/2015.
 */



import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;

import static org.junit.Assert.*;

public class MyBizTest extends  TestCase{

    BizLogic myBiz;

    @Before
    public void setUp() {
        myBiz = new BizLogic();
    }

    @Test
    public void testInteger() {
        // assertTrue(false);
        assertEquals(1, myBiz.integer);
    }

    @Test
    public void testDoubleInteger() {
        assertEquals(2, myBiz.doubleInteger());
    }

    @Test
    public void testMatchDate() {
        assertEquals("19-04-2015", myBiz.matchDate("The date is 19-04-2015 and the time is 10:14 PM"));
    }


}