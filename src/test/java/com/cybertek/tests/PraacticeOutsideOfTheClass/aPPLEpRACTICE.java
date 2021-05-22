package com.cybertek.tests.PraacticeOutsideOfTheClass;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class aPPLEpRACTICE {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.apple.com");
        List<WebElement>links = driver.findElements(By.xpath("//a"));
        int numberOFLinks= links.size();
        System.out.println(numberOFLinks);
        int hasText =0;
        int hasNoText=0;
        for (WebElement each :links){
            if (each.getText().isEmpty()){
                System.out.println(hasNoText++);
            }else if(!each.getText().isEmpty()){
                System.out.println((hasText++)+" " +each.getText());
            }
        }
        System.out.println("number of links "+ numberOFLinks);
        System.out.println("HAs text links "+hasText);
        System.out.println("has mo text "+hasNoText);
        System.out.println();
        //hello
    }
}
