package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	public WebDriver driver1;
	@BeforeClass
	public void setuo()
	{
		driver1=new ChromeDriver();
		driver1.get("https://sakhicollections.com/my-account/");
		driver1.manage().window().maximize();
	}

}
