package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RoleNG extends Base
{
    @Test(dataProvider="Rdata")
	public void Rol(String Rn,String Rt) throws InterruptedException
	{
	    LB.Role(Rn,Rt);	
	}
    
    @DataProvider
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
    
}