package com.cybertek.tests.day9_properties_browser_utils;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.LibraryUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P1_libraryLogIn {
    WebDriver driver;
    @BeforeMethod
    public  void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://library2.cybertekschool.com/login.html");

    }


    @Test
    public void login_link_counts_test(){
        //log in calling to log in Library app
        LibraryUtils.loginToLibrary(driver);
        // 6.Print out count of all the links on landing page
        BrowserUtils.sleep(3);
        List<WebElement> allLinks= driver.findElements(By.xpath("//body//a"));
        System.out.println("allLinks.Size()"+ allLinks.size());

        //7.Print out each link text on this page
        for(WebElement each : allLinks){
            System.out.println(each.getText());
        }
    }
}
