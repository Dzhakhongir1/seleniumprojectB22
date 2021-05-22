package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F3_HeaderVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        //verify the header text as expected
        WebElement header = driver.findElement(By.className("_8eso"));
        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        String actualOutput = header.getText();
        if (actualOutput.equals(expectedHeader)){
            System.out.println("header verification passed");
        }else{
            System.out.println("header verification fasle");
        }




    }
}
