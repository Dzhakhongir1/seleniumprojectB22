package com.cybertek.tests.day10_webtable_propertties_practice;

import com.cybertek.tests.base.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.TablesUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Table_Tasks extends TestBase {

    @Test
    public void task3_Return_tims_due_amount(){
        String url=ConfigurationReader.getProperty("dataTablesUrl");
        driver.get(url);
    WebElement timsDueAmountnCell=driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/following-sibling::td[2]"));
    String actualtimResult = timsDueAmountnCell.getText();
    String expectedTimResult= "$50.00";
        Assert.assertEquals(actualtimResult,expectedTimResult,"Tim's cell is not returning as expected");


//⦁	Locate first table and verify Tim has due amount of “$50”
//
//        Note: Create locator for Tim that will be dynamic and doesn’t care in which row Tim is.


    }
    @Test
    public void  task4_verify_odred_method(){
        String url=ConfigurationReader.getProperty("dataTablesUrl");
        driver.get(url);
        TablesUtils.verifyOrder(driver,"Tim");
    }
}
