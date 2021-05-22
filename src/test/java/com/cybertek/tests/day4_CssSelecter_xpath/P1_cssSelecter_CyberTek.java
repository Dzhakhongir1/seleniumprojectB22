package com.cybertek.tests.day4_CssSelecter_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_cssSelecter_CyberTek {
    public static void main(String[] args) {
        /*
        TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cybertek School” text
4. Verify all WebElements are displayed.
         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");
//        3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
//        a. “Home” link
        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        System.out.println(homeLink.isDisplayed());
        WebElement passwordHeader= driver.findElement(By.tagName("h2"));
        System.out.println(passwordHeader.isDisplayed());
        WebElement emailText = driver.findElement(By.cssSelector("label[for='email']"));
        System.out.println(emailText.isDisplayed());
        WebElement EmailInputBox =driver.findElement(By.cssSelector("input[type='text']"));
        System.out.println(EmailInputBox.isDisplayed());
        WebElement passwordRetrive = driver.findElement(By.cssSelector("button[id='form_submit']"));
        System.out.println(passwordRetrive.isDisplayed());
        WebElement PoweredByCyberTechVerify= driver.findElement(By.cssSelector("div[id='flash-messages']"));
        System.out.println(PoweredByCyberTechVerify.isDisplayed());
    }
}
