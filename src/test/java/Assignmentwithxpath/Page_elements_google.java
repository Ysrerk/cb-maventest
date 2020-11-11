package Assignmentwithxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Page_elements_google {
	By searchbox=By.xpath("//input[@name='q']");
	By searchresultcodingbook=By.xpath("//a[@href='https://codingbook.org/']");
	WebDriver driver=null;
	
	public Page_elements_google(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void typetosearchbox(String text) {
		driver.findElement(searchbox).sendKeys(text);
	}
	public void clickenter() {
		
		driver.findElement(searchbox).sendKeys(Keys.RETURN);
	}
	
	public void clicksearchresultcodingbook() {
		driver.findElement(searchresultcodingbook).sendKeys(Keys.RETURN);
	}

}
