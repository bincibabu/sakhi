package Test;

import org.testng.annotations.Test;

import Indexpage.Loginpage1;
import base.Baseclass;


public class Sakhioperations extends Createtest {
	@Test
	public void testing() throws InterruptedException
	{
      Loginpage1 lpp=new Loginpage1(driver1);
      lpp.header();
      Thread.sleep(5000);
      lpp.clickingg();
      Thread.sleep(5000);
      lpp.submit();
      Thread.sleep(5000);
      lpp.radiobutton();
      Thread.sleep(5000);
      lpp.setsize();
      Thread.sleep(5000);
      lpp.addcart();
      Thread.sleep(5000);
      lpp.icon();
      Thread.sleep(5000);
      lpp. checkouticon();
      Thread.sleep(5000);
      lpp.account();
      Thread.sleep(5000);
      lpp.logout();

}
}
