package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //1-set up the browser driver
        WebDriverManager.chromedriver().setup();
        //2-create instance of selenium web driver
        //this line is the browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //3- get the page for tesla.com
        driver.get("https://www.tesla.com");
        System.out.println("current title: "+driver.getTitle());
        String currentUrl = driver.getCurrentUrl();
        System.out.println("curret Url "+ currentUrl);

        //3 seconds wait
        Thread.sleep(3000);
        //going back using navigation
        driver.navigate().back();
        //going forward using navigation
        driver.navigate().forward();
        Thread.sleep(3000);
        //refreshing th eoage using navigation
        driver.navigate().refresh();

        //goint to another url using .to( methof
        driver.navigate().to("https://www.google.com");

        System.out.println("current title: "+driver.getTitle());
        currentUrl= driver.getCurrentUrl();
        System.out.println("Current url "+currentUrl);
        driver.manage().window().maximize();
       // driver.close();
        driver.quit();



    }
}
