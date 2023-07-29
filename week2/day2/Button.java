package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		Thread.sleep(1000);
		System.out.println("Title : "+driver.getTitle());
		driver.get("https://www.leafground.com/button.xhtml");
		Thread.sleep(1000);
		
		WebElement ele=driver.findElement(By.xpath("//button[@disabled='disabled']"));
		if(ele.isEnabled()==false)
		{
			System.out.println("Button is Disabled");
		}
		
		System.out.println("Position : "+driver.findElement(By.xpath("//h5[text()='Find the position of the Submit button']/following-sibling::button/span[text()='Submit']")).getLocation());
		String color=driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color");
		System.out.println(color);
		System.out.println("Height , Width : "+driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']/following-sibling::button/span[text()='Submit']")).getSize());

		if(driver.findElement(By.xpath("//h5[text()='Mouse over and confirm the color changed']/following-sibling::button")).getAttribute("onmouseover").equals("changecolor()"))
		{
			System.out.println("Color is changed on mouse hover");
		}
		driver.findElement(By.xpath("//h5[text()='Click Image Button and Click on any hidden button']/following-sibling::div//button/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h5[text()='Click Image Button and Click on any hidden button']/following-sibling::div//button/span")).click();
		List<WebElement> elems=driver.findElements(By.xpath("//h5[text()='How many rounded buttons are there?']/following-sibling::button[contains(@class,'rounded')]"));
		System.out.println("No of rounded buttons : "+elems.size());
		
		
		
	}

}
