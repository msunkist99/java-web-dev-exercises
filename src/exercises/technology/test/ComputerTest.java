package exercises.technology.test;

import exercises.technology.Laptop;
import exercises.technology.SmartPhone;
import org.junit.*;

import static org.junit.Assert.*;


public class ComputerTest {

   Laptop testLaptop = new Laptop(5, 5000);
   SmartPhone testSmartPhone = new SmartPhone(12, "Verizon");

   @Test
   public void emptyTest(){
      assertEquals(10, 10, .001);
   }

   @Test
   public void checkLaptopBatteryLife(){
      assertEquals(5, testLaptop.getBatteryLife(), .001);
   }

   @Test
   public void checkLaptopBatteryRemaining(){
      assertEquals(5, testLaptop.getBatteryRemaining(), .001);
   }

   @Test
   public void checkLaptopHardDriveRemainingAfterFileSave(){
      testLaptop.saveFile(250);
      assertEquals(4750, testLaptop.getHardDriveRemaining(), .001);
   }

   @Test
   public void checkSmartPhoneCarrier(){
      assertEquals("Verizon", testSmartPhone.getCarrier());
   }

   @Test
   public void checkSmartPhoneMakeCall(){
      assertTrue(testSmartPhone.makeCall());

      SmartPhone xSmartPhone = new SmartPhone(12, "");
      assertFalse(xSmartPhone.makeCall());
   }

   @Test
   public void checkLaptopId(){
      assertEquals(1, testLaptop.getId());
   }

   @Test
   public void checkSmartPhoneId(){
      assertEquals(2, testSmartPhone.getId());

      SmartPhone xSmartPhone = new SmartPhone(12, "");
      assertEquals(3, xSmartPhone.getId());
   }
}
