package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

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
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TEST1234561");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Divya1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("test1");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1238567890");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("TEST1123456@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Edit")).click();
		//Thread.sleep(4000);
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TEST12345612");
		driver.findElement(By.name("submitButton")).click();

}
}
