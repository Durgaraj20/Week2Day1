package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentFillingLeads {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Durga");	
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ponraju");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Durga");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Ponraju");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/20/1986");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("QA");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("8000000");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Website");
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Automobile");
		driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("Press");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("5");
		driver.findElement(By.id("createLeadForm_ownershipEnumId")).sendKeys("Partnership");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("458220");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("true23");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Software Tester");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Ready to join anytime");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("610");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("6105775436");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("0431");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Durga");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("durgaraj20@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.testleaf.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Durga Ponraju");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Deby");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Royersford,Pennsylvani");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("620021");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Trichy");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Tamilnadu");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("620013");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("620013-562");
		driver.findElement(By.name("submitButton")).click();
		String text=driver.findElement(By.id("viewLead_firstNameLocal_sp")).getText();
		System.out.println("The firstname is" + text);
		String title=driver.getTitle();
		System.out.println("The title is " + title);
		if(driver.getTitle().contains("Lead")) {
			System.out.println("The title is correct");
		}else 
			System.out.println("The title is not correct");
		
		

	}

}
