package org.launchcode.java.demos.lsn6inheritance.test;

import org.junit.Test;
import static org.junit.Assert.*;

import org.launchcode.java.demos.lsn6inheritance.HouseCat;
import org.launchcode.java.demos.lsn6inheritance.Cat;

public class CatTest {
    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }

    @Test
    public void defaultsSuperInSecondConstructor() {
        HouseCat testCat = new HouseCat("Test Cat");
        assertEquals(13, testCat.getWeight(), 001);
    }

    @Test
    public void isNotInitiallyTired() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
        assertFalse(keyboardCat.isHungry());
        assertFalse(keyboardCat.isTired());
        keyboardCat.eat();
        assertFalse(keyboardCat.isHungry());
        assertTrue(keyboardCat.isTired());
    }
}