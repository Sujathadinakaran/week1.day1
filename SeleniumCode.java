package week1.day1;

import org.openqa.selenium.By;



import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Selenium code to open the web browser automatically
		//
       WebDriverManager.chromedriver().setup();
       //
       ChromeDriver driver = new ChromeDriver();
       //load the url
      driver.get("http://leaftaps.com/opentaps/control/login");
       //driver.get("http://www.google.com");
       
       //maximize the browser window
       driver.manage().window().maximize();
       
       
	}
}









