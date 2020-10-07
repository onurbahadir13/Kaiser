import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Work\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.trendyol.com/"); 
		driver.findElement(By.className("fancybox-item")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@id=\'accountBtn\']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\'email\']")).click();
		driver.findElement(By.xpath("//input[@id=\'email\']")).sendKeys("test@testera.com");
		driver.findElement(By.id("password")).sendKeys("A1234567");
		driver.findElement(By.xpath("//*[@id=\'loginSubmit\']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='accountBtn']")).click(); //ssss
		driver.findElement(By.linkText("Kullanýcý Bilgilerim")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("UserModel_FirstName")).sendKeys("Test");
		driver.findElement(By.id("UserModel_LastName")).sendKeys("Testera");
		driver.findElement(By.id("UserModel_HiddenPhone")).sendKeys("05309213216");
		Select s=new Select(driver.findElement(By.id("BirthDateDay")));
		s.selectByValue("19");
		Select n=new Select(driver.findElement(By.id("BirthDateMonth")));
		n.selectByValue("3");
		Select y=new Select(driver.findElement(By.id("BirthDateYear")));
		y.selectByValue("1990");
		driver.findElement(By.xpath("//div[@class='checkBox']//label[text()='Erkek']")).click();
        WebElement guncel=driver.findElement(By.xpath("//div[@class='account-update']//section//a[contains(text(),'Güncelle')]"));  
		guncel.click();
		if(guncel.isSelected())
		{
			System.out.println(driver.findElement(By.xpath("//div[@class='account-update']//section//a[contains(text(),'Güncelle')]")).getText());
		}
		Thread.sleep(10000);
		driver.close();
		
	}
	
}
