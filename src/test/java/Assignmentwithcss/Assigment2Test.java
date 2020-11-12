package Assignmentwithcss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assigment2Test {
	static WebDriver driver=null;
	static Page_elements_google googlepage;
	static String text="codingbook";
	static String url="http://www.google.com";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setup();
		gotogoogle(url);
		googlepage.typetosearchbox(text);
		googlepage.clickenter();
		googlepage.clicksearchresultcodingbook();
		googlepage.click_test_automation_on_codingbook();
		googlepage.clickcurriculum();
		googlepage.clickbasicassignment();
		googlepage.clickingyoutubelink();

	}
	public static void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		googlepage=new Page_elements_google(driver);
		
	}
	public static void gotogoogle(String url) {
		driver.get(url);
	}

}
