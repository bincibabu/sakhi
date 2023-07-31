package Test;

import org.testng.annotations.Test;

import Indexpage.Loginpage;
import base.Baseclass;

public class Createtest  extends Baseclass{
	@Test
	public void verifycreate() throws InterruptedException
	{
		Loginpage lp=new Loginpage(driver1);
		
		lp.click();
		Thread.sleep(3000);
		lp.setvalue();
		Thread.sleep(3000);
		lp.create();
	}
	

}
