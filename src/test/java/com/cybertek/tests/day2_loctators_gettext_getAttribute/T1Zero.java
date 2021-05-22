package com.cybertek.tests.day2_loctators_gettext_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1Zero {
    public static void main(String[] args) {
        //Open browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2 go tothe Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        String expectedHeader = "Log in to ZeroBank";
        WebElement actualHeader = driver.findElement(By.tagName("h3"));
        String actualHeaderText = actualHeader.getText();


        if (actualHeaderText.equals(expectedHeader)){
            System.out.println("pass");
        }
    }
}
