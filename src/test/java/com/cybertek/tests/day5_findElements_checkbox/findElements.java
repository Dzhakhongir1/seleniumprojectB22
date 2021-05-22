package com.cybertek.tests.day5_findElements_checkbox;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class findElements {
    public static void main(String[] args) {
        WebDriver driver =WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // if not found this will wait  up to giving seconds
        //if  web element is located before 15 seconds it will move on
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //print out text of the link
        // we need to create all of the links on the page

        // we are storing all of the links that re returned by find elements
        List<WebElement>listOfLinks = driver.findElements(By.xpath("//body//a"));
        for (WebElement each : listOfLinks){
            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));
        }
        System.out.println("total links found using that method is = "+listOfLinks.size());
        //print out how many links

    }
}
