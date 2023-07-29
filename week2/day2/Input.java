package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Input {

	public static void main(String[] args) throws InterruptedException {
		//now running  TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).sendKeys("Divya");
		String value=driver.findElement(By.xpath("//input[@value='Chennai']")).getText();
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys(value+"-600018");
		System.out.println(driver.findElement(By.xpath("(//h5[text()='Verify if text box is disabled']/following::div/div/input)[1]")).getAttribute("placeholder"));
		driver.findElement(By.xpath("(//h5[text()='Clear the typed text.']/following::div/div/input)[1]")).clear();
		System.out.println(driver.findElement(By.xpath("(//h5[text()='Retrieve the typed text.']/following::div/div/input)[1]")).getAttribute("value"));
		driver.findElement(By.xpath("(//h5[text()='Type email and Tab. Confirm control moved to next element.']/following::div/div/input)[1]")).sendKeys("email");
		driver.findElement(By.xpath("(//h5[text()='Type email and Tab. Confirm control moved to next element.']/following::div/div/input)[1]")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("(//h5[text()='Type about yourself']/following::div/div/textarea)[1]")).sendKeys("I'm divya");
		
		/*driver.findElement(By.xpath("(//div[@contenteditable='true'][@class='ql-editor ql-blank'])[1]")).sendKeys("I can edit texts here");
		driver.findElement(By.xpath("(//div[@contenteditable='true'][@class='ql-editor ql-blank'])[1]")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
		WebElement edit=driver.findElement(By.xpath("//span[@class='ql-formats']/span[@class='ql-font ql-picker']/span[@aria-controls='ql-picker-options-0']"));
		edit.click();
		driver.findElement(By.xpath("//span[@id='ql-picker-options-0']/span[@data-value='monospace']")).click();*/
		
		driver.findElement(By.xpath("(//h5[text()='Just Press Enter and confirm error message*']/following::div/div/input)[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.className("ui-message-error-detail")).getText());
		
		//click and confirm label position
		driver.findElement(By.xpath("//h5[text()='Click and Confirm Label Position Changes']/following::span/input")).click();
		if(driver.findElement(By.xpath("//h5[text()='Click and Confirm Label Position Changes']/following::span/input")).getAttribute("class").contains("hover")==true)
		{
		System.out.println("The label position is changed");
		}
		driver.findElement(By.xpath("//span[@class='ui-float-label']//input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("divya");
		driver.findElement(By.xpath("//li[contains(@data-item-label,'divya')][3]")).click();
		//driver.findElement(By.xpath("//span[contains(@class,'datepicker')][1][contains(@class,'calendar')]")).click();
		driver.findElement(By.xpath("//span[contains(@class,'p-datepicker ui-calendar')]//input[1]")).sendKeys("03/19/1993");
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[contains(text(),9)]")).click();
		
		driver.findElement(By.xpath("//span[@class='ui-spinner ui-widget ui-corner-all ui-spinner-stacked']/input")).sendKeys("4");
		driver.findElement(By.xpath("//a[@class='ui-spinner-button ui-spinner-up ui-corner-tr ui-button ui-widget ui-state-default ui-button-text-only']//span/span")).click();
		
		driver.findElement(By.xpath("//input[contains(@id,'slider')]")).sendKeys("11");
		System.out.println(driver.findElement(By.xpath("//span[contains(@class,'slider')]")).getAttribute("style"));

		driver.findElement(By.xpath("//input[contains(@class,'keyboard')]")).click();
		Thread.sleep(1000);
		if(driver.findElement(By.xpath("//input[contains(@class,'keyboard')]")).getAttribute("class").contains("focus")==true)
				{
			System.out.println("Keyboard is enabled");
	}
		
	
	
	}

}
