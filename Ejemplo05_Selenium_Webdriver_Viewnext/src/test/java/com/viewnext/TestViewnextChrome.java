package com.viewnext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestViewnextChrome {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Alvaro/Desktop/T-BACK/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		String url ="https://www.viewnext.com/";
	
		driver.get(url);
		
		System.out.println("Titulo " + driver.getTitle());
		
		driver.quit();
	}

}
