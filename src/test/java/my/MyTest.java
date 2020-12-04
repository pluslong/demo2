package my;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertEquals;

/** 
* My Tester. 
* 
* @author <Authors name> 
* @since <pre>12�� 3, 2020</pre> 
* @version 1.0 
*/ 
public class MyTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: say(String saystr) 
* 
*/ 
@Test
public void testSay() throws Exception { 
//TODO: Test goes here...
    assertEquals("失败",2,2);
    //assertEquals("失败",1,1);

}

    @Test
    public void testSay2() throws Exception {
//TODO: Test goes here...
        assertEquals("失败",2,2);
        assertEquals("失败",1,2);

    }
} 
