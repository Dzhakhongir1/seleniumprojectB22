package com.cybertek.tests.day2_loctators_gettext_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2ZeroBankATTRIBUTEVERIFICAtion {
    public static void main(String[] args) {
        //TC #2: Zero Bank link text verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html

        // 3. Verify link text from top left:
        driver.get("http://zero.webappsecurity.com/login.html");

        //Locate the link and store inside Of the Web Element

        WebElement zeroBAnkLink =driver.findElement(By.className("brand"));
        //3. Verify link text from top left:
        //Expected: “Zero Bank”
        String expectedLinkTex= "Zero Bank";
        String actualLinkText = zeroBAnkLink.getText();

       if(actualLinkText.equals(expectedLinkTex)){
           System.out.println("link text verification passed!");
       } else{
           System.out.println("link text verification failed!");
       }

        //4. Verify link href attribute value contains:
        //Expected: “index.html”
        String expectedHref= "index.html";
        String actualGrefVAlue= zeroBAnkLink.getAttribute("href");
        if (actualGrefVAlue.contains(expectedHref)){
            System.out.println("pass");
        }else{
            System.out.println("fail");

        }

    }
}
