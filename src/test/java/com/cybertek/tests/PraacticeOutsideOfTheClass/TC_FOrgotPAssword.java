package com.cybertek.tests.PraacticeOutsideOfTheClass;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class TC_FOrgotPAssword {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");


    }
}
