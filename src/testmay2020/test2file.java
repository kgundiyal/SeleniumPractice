package testmay2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2file {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub


				System.out.println("Hello world ");
				System.setProperty("webdriver.chrome.driver","/Users/kgundiyal/Downloads/chromedriver 2");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.google.com");
				driver.quit();
	}

		

	}


