package com.cybertek.OfficeHours.OH_day02;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
/*
1. The user navigates to the login page: http://zero.webappsecurity.com/login.html
2. The user logs in with the user "username" and the password "password"
3. The user navigates to Account Activity page
4. Then The page should have the title "Zero - Account Activity"
5. Then Account drop down should have the following options :
(Savings, Checking, Savings, Loan, Credit Card, Brokerage)
6. Brokerage option should have "No results."

 */
public class ZeroBankAccountActitvity1 {
    WebDriver driver;
    @BeforeClass
    public void SetUpClass(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://zero.webappsecurity.com/login.html");
        //log in
        driver.findElement(By.cssSelector("[id*=user_log]")).sendKeys("username");
        driver.findElement(By.cssSelector("[id*=user_pass]")).sendKeys("password"+ Keys.ENTER);
        driver.findElement(By.cssSelector("[id*='primary-button']")).click();

    }
    @Test
    public void ZeroBank(){
        WebElement checkingAccountActivity = driver.findElement(By.cssSelector("[id*='account']"));
        checkingAccountActivity.click();
        String expectedTitle= "Zero - Account Activity";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Wrong locator");
        List<String>expectedOptions = new ArrayList<>(Arrays.asList("Savings", "Checking", "Savings",
                "Loan", "Credit Card", "Brokerage"));

        Select optionsBank= new Select(driver.findElement(By.cssSelector("[id*='aa_accountId']")));

        System.out.println(optionsBank.getOptions());
        optionsBank.selectByValue("6");
        String expectedMessage="No results";

    }
}
