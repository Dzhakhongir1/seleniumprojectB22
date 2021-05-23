package com.cybertek.tests.day6_testing_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Po_Checkbox_Practice {
    public static void main(String[] args) {
//        Practice: Cybertek Checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        1. Go to http://practice.cybertekschool.com/checkboxes
//        2. Confirm checkbox #1 is NOT selected by default

        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkbox1= driver.findElement(By.xpath("//input[@id='box1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='box2']"));
        boolean type2 = (!checkbox1.isSelected()) ? true: false;
        System.out.println(type2);
        System.out.println(checkbox2.isSelected());
//        3. Confirm checkbox #2 is SELECTED by default.
        System.out.println(checkbox2.isSelected());
//        4. Click checkbox #1 to select it.
        checkbox1.click();
//        5. Click checkbox #2 to deselect it.
        checkbox2.click();
//        6. Confirm checkbox #1 is SELECTED.
        System.out.println(checkbox1.isSelected());
//        7. Confirm checkbox #2 is NOT selected.
        boolean type = (!checkbox2.isSelected()) ? true: false;
        System.out.println(type);
    }
}
