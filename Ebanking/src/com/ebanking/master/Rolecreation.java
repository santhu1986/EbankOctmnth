package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Rolecreation 
{

	//EP
	
	@FindBy(id="txtRname")
	WebElement Rname;
	
	@FindBy(id="lstRtypeN")
	WebElement Rtyp;
	
	@FindBy(id="btninsert")
	WebElement Rsubmit;
	
	//Element Method
	
	public void Rcre(String Rn,String Rt) throws InterruptedException
	{
		Rname.sendKeys(Rn);
		Select RT=new Select(Rtyp);
		RT.selectByVisibleText(Rt);
		Thread.sleep(3000);
		Rsubmit.click();
	}
}
