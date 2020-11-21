package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.*;

public class CarTest {
    Car testCar;
    @Before
    public void createCarObject(){
        testCar = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest(){
        assertEquals(10, 10, .001);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank()
    {
        assertEquals(10,testCar.getGasTankLevel(), .001);
    }

    @Test
    public void testInitialGasTankAssetFalse() {
        assertFalse(testCar.getGasTankLevel() == 20);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving() {
        testCar.drive(50);
        assertEquals(9, testCar.getGasTankLevel(),.001);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankAfterExceedingTankRange() {
        // how many more miles can the car go on gas tank level
        //double milesRemaining = testCar.getGasTankLevel() * testCar.getMilesPerGallon();

        // try to drive one mile further than gas tank range
        testCar.drive((testCar.getGasTankLevel() * testCar.getMilesPerGallon()) + 1);
        //testCar.drive(milesRemaining + 1);

        // gas tank level should be zero after trying to drive further than
        // gas tank level will allow
        assertEquals(0,testCar.getGasTankLevel(),.001);
    }

    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException(){
        // try to over fill the gas tank by one gallon
        testCar.addGas(testCar.getGasTankSize() - testCar.getGasTankLevel() + 1);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank.");
    }
}
