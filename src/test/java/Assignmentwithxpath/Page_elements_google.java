package Assignmentwithxpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page_elements_google {
	By searchbox=By.xpath("//input[@name='q']");
	By searchresultcodingbook=By.xpath("//a[@href='https://codingbook.org/']");
	//By testautomationchoice=By.xpath("//ul[@class=' dropdown-menu']/li[@id='menu-item-6538']");
	WebDriver driver=null;
	
	//WebElement testautomationchoice=driver.findElement(By.xpath("//ul[@class=' dropdown-menu']/li[@id='menu-item-6538']"));
	public Page_elements_google(WebDriver driver) {
		this.driver=driver;
		
	}
	//wring coding book on search box  in google main page
	public void typetosearchbox(String text) {
		driver.findElement(searchbox).sendKeys(text);
	}
	//clicking enter in search box
	public void clickenter() {
		
		driver.findElement(searchbox).sendKeys(Keys.RETURN);
	}
	// finding coding book page  and clicking in google results
	public void clicksearchresultcodingbook() {
		driver.findElement(searchresultcodingbook).sendKeys(Keys.RETURN);
	}
	//finding course on menu  then clicking test automation option
	public void click_test_automation_on_codingbook() throws InterruptedException {
		Thread.sleep(5000);
		
		WebElement Courses=driver.findElement(By.xpath("//li[@id='menu-item-6539']"));
		
		By testautomationn = By.xpath("//li[@id='menu-item-6539']/ul/li[@id='menu-item-6538']/a");
		WebElement testautomation=driver.findElement(testautomationn);
		Actions action = new Actions(driver);
		
		action.moveToElement(Courses).build().perform();
		Thread.sleep(5000);
		action.moveToElement(testautomation).click().build().perform();
		
	}
	
	//controlling test automation page and clicking curriculum
	public void clickcurriculum() throws InterruptedException {
		driver.findElement(By.xpath("//h1[@class='course-title entry-title']")).isDisplayed();
		WebElement curriculum=driver.findElement(By.xpath("//a[@data-tab='#tab-curriculum']"));
		Thread.sleep(3000);
		curriculum.click();
	}
	//clicking basic assignment
	public void clickbasicassignment() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"section-html-element-locators-5\"]/ul/li[8]/a/span")).click();
		Thread.sleep(5000);
	
	}
	
	public void clickingyoutubelink() {
		
		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/watch?v=LYqbNg5I9sA']")).click();
	}

}
