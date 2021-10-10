package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/");
String text=driver.findElement(By.tagName("h2")).getText();
System.out.println(text);
String text1=driver.findElement(By.id("Username")).getText();
System.out.println(text1);
//Thread.sleep(2000);
//driver.close();


	}

}
