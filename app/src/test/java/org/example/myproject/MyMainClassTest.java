package org.example.myproject;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyMainClassTest {

    @Test
    public void testAdd() {
        MyMainClass myMainClass = new MyMainClass();
        assertEquals(5, myMainClass.add(2, 3));
    }

    @Test
    public void testSubtract() {
        MyMainClass myMainClass = new MyMainClass();
        assertEquals(1, myMainClass.subtract(3, 2));
    }
}
