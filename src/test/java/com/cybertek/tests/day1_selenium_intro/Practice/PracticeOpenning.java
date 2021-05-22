package com.cybertek.tests.day1_selenium_intro.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOpenning {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yahoo.com");
        String expectedTitle= "Yahoo";
        String actualTitle= driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Test case Pass!");
        }else{
            System.out.println("test case Failed!");
        }
        driver.close();

    }
}
