package Indexpage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Loginpage1 {
	WebDriver driver1;

	
By emailfield=By.xpath("//*[@id=\"username\"]");
By passfiled=By.id("password");
By loginbutton=By.xpath("//*[@id=\"customer_login\"]/div[1]/form/div[4]/button");
By shops=By.xpath("//*[@id=\"top-menu-desktop\"]/li[2]/a");
By scategory=By.xpath("//*[@id=\"woocommerce_product_categories-2\"]/div");
By scasuals=By.xpath("//*[@id=\"woocommerce_product_categories-2\"]/ul/li[2]/a");

By selectbutton=By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/div[3]/div[1]/a/h2");
//WebElement radio = driver1.findElement(By.xpath("//*[@id=\"product-53888\"]/div/div[2]/div/div/div[1]/form/div/table/tbody/tr[1]/td/ul/li[1]/div/span"));
By colour=By.xpath("//*[@id=\"product-53888\"]/div/div[2]/div/div/div[1]/form/div/table/tbody/tr[1]/td/ul/li[1]");
By ssize=By.xpath("//*[@id=\"product-53888\"]/div/div[2]/div/div/div[1]/form/div/table/tbody/tr[2]/td/ul/li[3]/div/label/input");
By addtocart=By.xpath("//*[@id=\"product-53888\"]/div/div[2]/div/div/div[1]/form/div/div/div[2]/button");
By carticon=By.xpath("//*[@id=\"top-menu-desktop\"]/li[3]/a");
By checkout=By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[7]/td/a");
By accounticon=By.xpath("//*[@id=\"main-header\"]/div[4]/div/div[2]/div[3]/div/div[2]/a/i");
By logouticon=By.xpath("/html/body/div[2]/div/header/div[2]/a");


public Loginpage1(WebDriver driver1) {
	// TODO Auto-generated constructor stub
	//driver1=new ChromeDriver();
	this.driver1=driver1;
}

public void  header()
{
	
	driver1.findElement(emailfield).sendKeys("bincibabu12@gmail.com");
	driver1.findElement(passfiled).sendKeys("Binci@1209");
}

public void clickingg()
{
driver1.findElement(loginbutton).click();
driver1.findElement(shops).click();


}
public void  submit()
{
	driver1.findElement(scategory).click();
	driver1.findElement(scasuals).click();
	driver1.findElement(selectbutton).click();
	
}
public void radiobutton()
{
driver1.findElement(colour).click();
//radio.click();
}
public void setsize()
{
	driver1.findElement(ssize).click();
}
public void addcart()
{
	driver1.findElement(addtocart).click();
}
public void icon()
{
	driver1.findElement(carticon).click();
	
}
public void  checkouticon()
{
	driver1.findElement(checkout).click();
}
public void account()
{
	driver1.findElement(accounticon).click();
}
public void logout()
{
	driver1.findElement(logouticon).click();
}
}











