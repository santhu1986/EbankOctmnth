package com.ebanking.master;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exepom 
{
	WebDriver driver;
	
	   @BeforeTest
      public void login() throws InterruptedException 
    {
        driver=new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.get("http://122.175.8.158/ranford2");
    	
    	//Page Factory
    	
    	RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
    	RHP.login();
    	
    }
	   @Test
	   public void Rcreation() throws InterruptedException, IOException
	   {
		 //To Get Test Data File
			
			FileInputStream FIS=new FileInputStream("E:\\Mrngsepbatch\\Ebanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
			
			//Work Book
			
			XSSFWorkbook WB=new XSSFWorkbook(FIS);
			
			//Sheet
			
			XSSFSheet WS=WB.getSheet("Rdata");
			
			//Row Count
			
			int Rcount=WS.getLastRowNum();
			System.out.println(Rcount);
			
			//Multiple Iterations ---------------------Loop
			
			for (int i=1;i<=Rcount;i++) 
			{
				
				//Rows
				
				XSSFRow WR=WS.getRow(i);
				
				//Cell
				
				XSSFCell WC=WR.getCell(0);
				XSSFCell WC1=WR.getCell(1);
				
				XSSFCell WC2=WR.createCell(2);
				
				//Cell Values
				
				String Rname=WC.getStringCellValue();
				String Rty=WC1.getStringCellValue();
		
    	
    	//Role
    	
    	AdminHP AHP=PageFactory.initElements(driver,AdminHP.class);
    	AHP.Rol();
    	
    	//New Role
    	
    	Roledetails RD=PageFactory.initElements(driver,Roledetails.class);
    	RD.Nrole();
    	
    	//Role Creation
    	
    	Rolecreation RC=PageFactory.initElements(driver,Rolecreation.class);
    	RC.Rcre(Rname,Rty);
    	
    	//Alert
    	
    	driver.switchTo().alert().accept();
    	
    	Thread.sleep(3000);
    	
    	RD.Hom();
    
    }
	  /* @DataProvider
	    public Object [][] Rdata()
	    {
	       Object [][] Obj=new Object[3][2];
	       
	       Obj[0][0]="Mqsystesterjr";
	       Obj[0][1]="E";
	       
	       Obj[1][0]="Mqsystestersr";
	       Obj[1][1]="E";
	       
	       Obj[2][0]="Mqstesterlead";
	       Obj[2][1]="E";
	       
	       return Obj;
	       
	     }
*/	    
}
	   
}