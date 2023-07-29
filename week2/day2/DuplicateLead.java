package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']/span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("test");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String linkTxt=driver.findElement(By.xpath("//tbody/tr/td/div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[contains(@href,'cr')][1]")).getText();
		driver.findElement(By.linkText(linkTxt)).click();	
		Thread.sleep(1000);
		String firstName=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.findElement(By.name("submitButton")).click();
		
		if(firstName.equals(driver.findElement(By.id("viewLead_firstName_sp")).getText()))
		{
		System.out.println("duplicated lead name is same as captured name");
		}
		
		driver.close();
		
		
		
	}

}
