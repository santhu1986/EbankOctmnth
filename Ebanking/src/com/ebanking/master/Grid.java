package com.ebanking.master;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid 
{
	
	DesiredCapabilities Cap;
	      @Parameters("Browser")
	      @Test
         public void Gd(String Br) throws MalformedURLException, InterruptedException
         {
	    	  if (Br.equalsIgnoreCase("firefox"))
	    	  {
	    		  Cap=new DesiredCapabilities();
	           	  Cap.setBrowserName("firefox");
	         	  Cap.setPlatform(Platform.WINDOWS);
	          }
	    	  else if (Br.equalsIgnoreCase("chrome")) 
	    	  {
	    		 Cap=new DesiredCapabilities();
	         	 Cap.setBrowserName("chrome");
	         	 Cap.setPlatform(Platform.ANY);
	     
			  }
        	     	 
        	 RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.44.1:4444/wd/hub"),Cap);
        
        		driver.manage().window().maximize();
        		
        		//URL
        		
        		driver.get("http://122.175.8.158/ranford2");
        		driver.findElement(By.id("txtuId")).sendKeys("Admin");
        		driver.findElement(By.id("txtPword")).sendKeys("Te$ting@");
        		driver.findElement(By.xpath("//input[@name='login']")).click();
        		
        		 driver.findElement(By.xpath("//img[@src='images/Branches_but.jpg']")).click();
     		    
     	        driver.findElement(By.xpath("//input[contains(@name,'BtnNewBR')]")).click();
     		     
     		     driver.findElement(By.id("txtbName")).sendKeys("mindqsysman");
     		     driver.findElement(By.id("txtAdd1")).sendKeys("srnagar");
     		     
     		     driver.findElement(By.id("txtZip")).sendKeys("12345");
     		     
     		    //Dropdown
     		     
     		     Select Ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
     		     Ctry.selectByVisibleText("INDIA");
     		     
     		     new Select(driver.findElement(By.id("lst_stateI"))).selectByVisibleText("GOA");
     		     
     		     new Select(driver.findElement(By.id("lst_cityI"))).selectByVisibleText("GOA");
     		     
     		     driver.findElement(By.id("btn_insert")).click();
     		     
     		     Thread.sleep(3000);
     		     
     		     driver.switchTo().alert().accept();
     		
         }
	 
}
