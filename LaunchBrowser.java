package week3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class LaunchBrowser{
	public static void main(String[] args) {
		//to launch the chrome Browser
		ChromeDriver  driver = new ChromeDriver();
	   // to lad ther url
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize(); 		
//	String title = get.title
		// to get the title page
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.partialLinkText("CRM/S")).click();
driver.findElement(By.linkText("Leads")).click(); 
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suresh");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ashwin");
WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select obj = new Select(source);
obj.selectByIndex(4);
WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
Select obj1 = new Select(marketing);
obj1.selectByValue("9001");
WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select obj2 = new Select(ownership);
obj2.selectByIndex(5);
WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
Select obj3 = new Select(country);
obj3.selectByVisibleText("India");
driver.findElement(By.name("submitButton")).click();
String title = driver.getTitle();
System.out.println(title);




	}
}
