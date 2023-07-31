package Indexpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver1;
	By Slogin=By.xpath("//*[@id=\"main-header\"]/div[4]/div/div[2]/div[3]/div/div[2]/a/i");
By Sreg= By.xpath("//*[@id=\"customer_login\"]/div[1]/form/div[5]/a");
By Semail=By.id("reg_email");
By Sregister=By.xpath("//*[@id=\"customer_login\"]/div[2]/form/div[4]/button");

public Loginpage(WebDriver driver1) {
	// TODO Auto-generated constructor stub
	this.driver1=driver1;
}
public void click()
{
	driver1.findElement(Slogin).click();
	driver1.findElement(Sreg).click();
	
}
public void setvalue()
{
	driver1.findElement(Semail).sendKeys("bincibabu12@gmail.com");
}
public void create()
{
	driver1.findElement(Sregister).click();
	
}
}

