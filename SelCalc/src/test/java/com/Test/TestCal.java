package com.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCal {
	
	String path = System.getProperty("user.dir");


	
	private WebDriver driver;

	@BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", path + "\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://www.calculator.net/");			
	  }
	
		@Test
			
			public void Multiplication()
			{
			    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			    
			    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
			    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
			    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
			  
			   //for multiplication
			    
			    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[4]")).click();
			    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
			    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
			    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
				
			    String actualResult= driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).getText().trim();
				
			    String expectedResult="222075";
				Assert.assertEquals(expectedResult,actualResult);	
				driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
				
			}
		@Test
		
		public void Division()
		{
		    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  
		    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
		    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		    
		    //for Division 
		  
		    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[4]")).click();
		  
		    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
		    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		    
		    String actualResult= driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).getText().trim();
			
		    String expectedResult="20";
			Assert.assertEquals(expectedResult,actualResult);		
			driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
			
		}

		 @Test
			
			public void Add()
			{
			 driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
			 driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
			 driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
			 driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
			 driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
			 driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
			 driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
			
			  //for Addition 
			 driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();
			 
			driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
			driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
			driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
			driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
			driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
			driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();

		    String actualResult= driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).getText().trim();
			
		    String expectedResult="111111";
			Assert.assertEquals(expectedResult,actualResult);		
			driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
			}

		 @Test
			
			public void Substraction()
			{
			
			 driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
			 driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
			 driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
			 driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[2]")).click();
			 driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
			 driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
			
			  //for Substraction 
			 
			 driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
			 
			 driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();				 
			 driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
			 driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
			 driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
			 driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[3]")).click();
			 driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
			 driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[2]")).click();
			 driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
			 driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
			 
		    String actualResult= driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).getText().trim();
			
		    String expectedResult="23329646";
			Assert.assertEquals(expectedResult,actualResult);		
			driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
			}
		 
     @AfterTest
	public void DriverClose()
	{
		driver.quit();
	}
	
}
