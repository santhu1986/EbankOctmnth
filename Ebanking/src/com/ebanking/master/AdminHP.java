package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHP
{
	
	//EP
	
    @FindBy(xpath="//img[@src='images/Branches_but.jpg']")
    WebElement Branch;
    
    @FindBy(xpath=".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")
    WebElement Role;
    
    @FindBy(xpath="//img[@src='images/emp_btn.jpg']")
    WebElement Employee;
    
    @FindBy(xpath="//img[@src='images/admin_but_03.jpg']")
    WebElement Logout;
    
    //Methods
    
    public void Br() 
    {
    Branch.click();	
    }
    
    public void Rol() 
    {
    Role.click();	
    }
    
    public void Emp() 
    {
    Employee.click();	
    }
    
    public void Lout() 
    {
    Logout.click();	
    }
}
