package com.cybertek.tests.day4_CssSelecter_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_WebOrdersLogIn {
    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        ChromeDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
                String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification Passed!");
        }else{
            System.out.println("Title Verification Failed!!");
        }
        WebElement inputUser = driver.findElement(By.id("ctl00_MainContent_username"));
        inputUser.sendKeys("Tester");

        inputUser = driver.findElement(By.id("ctl00_MainContent_password"));
        inputUser.sendKeys("test"+ Keys.ENTER);
        String expectedTitle2 = "Web Orders";
        String actualTitle2 = driver.getTitle();
        if (actualTitle2.equals(expectedTitle2)){
            System.out.println("Title Verification Passed");
        }else {
            System.out.println("Title Verification Failed");
        }
    }
}
