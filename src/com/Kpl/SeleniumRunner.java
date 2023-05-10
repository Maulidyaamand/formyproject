package com.Kpl;

import java.awt.Dimension;

public class SeleniumRunner {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/form");
		
		driver.manage().window().setSize(new Dimension(1296, 688));
		
		// 
	    driver.findElement(By.id("first-name")).click();
	    // 
	    driver.findElement(By.id("first-name")).sendKeys("maulidya");
	    // 
	    driver.findElement(By.id("last-name")).click();
	    // 
	    driver.findElement(By.id("last-name")).sendKeys("amanda");
	    // 
	    driver.findElement(By.id("job-title")).click();
	    //  
	    driver.findElement(By.id("job-title")).sendKeys("quality assurance");
	    //
	    driver.findElement(By.id("radio-button-1")).click();
	    // 
	    driver.findElement(By.id("radio-button-2")).click();
	    //  
	    driver.findElement(By.id("radio-button-3")).click();
	    //
	    driver.findElement(By.cssSelector(".input-group:nth-child(9) > .col-sm-8:nth-child(3)")).click();
	    //  | 
	    driver.findElement(By.id("checkbox-2")).click();
	    // 
	    driver.findElement(By.id("select-menu")).click();
	    // 
	    {
	      WebElement dropdown = driver.findElement(By.id("select-menu"));
	      dropdown.findElement(By.xpath("//option[. = '0-1']")).click();
	    }
	    // 
	    driver.findElement(By.id("datepicker")).click();
	    // 
	    driver.findElement(By.cssSelector("tr:nth-child(2) > .day:nth-child(5)")).click();
	    // 
	    driver.findElement(By.linkText("Submit")).click();

	    
	    driver.close();
		
	}

}
