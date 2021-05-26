package com.cybertek.OfficeHours;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MoneyGamingTask {
    @Test
    public void Task1(){

//          1. Navigate to: https://moneygaming.qa.gameaccount.com/
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://moneygaming.qa.gameaccount.com/");
//        2. Click the JOIN NOW button to open the registration page
        WebElement joinButton = driver.findElement(By.xpath("//a[.='Join Now!']"));
        joinButton.click();
        WebElement titleelement = driver.findElement(By.id("title"));
//        3. Select a title value from the dropdown
        Select titleDropDown = new Select(titleelement);
        titleDropDown.selectByVisibleText("Mr");
        //verify it it was selected
        String expectedtitle = "Mr";
        String actualTitle = titleDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualTitle,expectedtitle,"verify the title");
//        4. Enter your first name and surname in the form
        WebElement name = driver.findElement(By.xpath("//input[@id='forename']"));
        name.sendKeys("jaha");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='map(lastName)']"));
        lastName.sendKeys("Islamov");
//        5. Check the tickbox with text 'I accept the Terms and Conditions and certify that I am over the age of 18.'
        WebElement checkBox= driver.findElement(By.xpath("//input[@name='map(terms)']"));
        checkBox.click();
//        6. Submit the form by clicking the JOIN NOW button
        WebElement submit = driver.findElement(By.xpath("//input[@id='form']"));
        submit.click();
//        7. Validate that a validation message with text ‘ This field is required’ appears under the date of
//        birth box
        String expectedError = "This field is required";
        String actualError = driver.findElement(By.xpath("//label[@for='dob']")).getText();
        Assert.assertEquals(actualError,expectedError,"verify dob location");

    }
}
