package newpackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class MyClass{
	public static void main(String args[])
	{
		   System.setProperty("webdriver.chrome.driver","/Users/chetan.kumar/Downloads/chromedriver72");
           WebDriver driver = new ChromeDriver();
           String webpageURL ="https://www.facebook.com/";
           driver.get(webpageURL);
           driver.findElement(By.name("firstname")).sendKeys("Cookie");
           driver.findElement(By.name("lastname")).sendKeys("Choudhary");
           driver.findElement(By.id("u_0_o")).sendKeys("9198670175");
           driver.findElement(By.id("u_0_v")).sendKeys("Cookie123");
           WebElement a = driver.findElement(By.id("day"));
           
           
           Select sel1 = new Select (a);
           Select sel2 = new Select (driver.findElement(By.id("month")));
           Select sel3 = new Select (driver.findElement(By.id("year")));
           sel1.selectByValue("4");
           sel2.selectByIndex(2);
           sel3.selectByValue("1997");
           WebElement radio1 = driver.findElement(By.id("u_0_9"));
           WebElement radio2 = driver.findElement(By.id("u_0_a"));
           radio1.click();
           //radio1.click();
           driver.findElement(By.id("u_0_11")).sendKeys(Keys.ENTER);
	}
	
}


