package Assignmentwithcss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page_elements_google {
	By searchbox=By.cssSelector("input[name='q']");
	By searchresultcodingbook=By.cssSelector("a[href='https://codingbook.org/']");
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
		
		WebElement Courses=driver.findElement(By.cssSelector("#menu-item-6539"));
		
		By testautomationn = By.cssSelector("a[title='Test Automation']");
		WebElement testautomation=driver.findElement(testautomationn);
		Actions action = new Actions(driver);
		
		action.moveToElement(Courses).build().perform();
		Thread.sleep(5000);
		action.moveToElement(testautomation).click().build().perform();
		
	}
	
	//controlling test automation page and clicking curriculum
	public void clickcurriculum() throws InterruptedException {
		driver.findElement(By.cssSelector("h1[itemprop='name']")).isDisplayed();
		WebElement curriculum=driver.findElement(By.cssSelector("a[data-tab='#tab-curriculum']"));
		Thread.sleep(3000);
		curriculum.click();
	}
	//clicking basic assignment
	public void clickbasicassignment() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"section-html-element-locators-5\"]/ul/li[8]/a/span")).click();
		Thread.sleep(5000);
	
	}
	
	public void clickingyoutubelink() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[href='https://www.youtube.com/watch?v=LYqbNg5I9sA']")).click();
		Thread.sleep(3000);
	}

}
