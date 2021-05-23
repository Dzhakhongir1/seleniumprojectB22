package com.cybertek.tests.PraacticeOutsideOfTheClass;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Amazongettitle {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("wooden spoon"
                + Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String actualtitle = driver.getTitle();
        System.out.println(actualtitle);
        String expectedTitle = "Amazon.com : wooden spoon";
        String check =actualtitle.equals(expectedTitle) ? "Yes it does" :" no it does not ";
        System.out.println(check);


    }
}
