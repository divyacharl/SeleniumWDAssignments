package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//label[text()='Chrome']/preceding-sibling::div/div[contains(@class,'radio')]")).click();
		Thread.sleep(1000);
		
		//for unselectable radio button
		driver.findElement(By.xpath("//label[text()='Bengaluru']/preceding-sibling::div/div[contains(@class,'radio')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Bengaluru']/preceding-sibling::div/div[contains(@class,'radio')]")).click();
		System.out.println(driver.findElement(By.xpath("//h5[text()='Find the default select radio button']/following::tbody//div[contains(@class,'active')]/parent::div//following-sibling::label")).getText());
		List<WebElement> ele=driver.findElements(By.xpath("//h5[text()='Select the age group (only if not selected)']/following::div//span[contains(@class,'bullet')]"));
		if(ele.isEmpty()==true)
		{
			driver.findElement(By.xpath("//h5[text()='Select the age group (only if not selected)']/following::div//span[contains(@class,'blank')])[1]")).click();
		}
		else
		{
			System.out.println("Radio button is enabled already");
		}
		driver.close();
	}

}
