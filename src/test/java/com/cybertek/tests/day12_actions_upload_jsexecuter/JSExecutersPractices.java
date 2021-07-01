package com.cybertek.tests.day12_actions_upload_jsexecuter;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecutersPractices {
    @Test
    public void scroll_using_jsExecuteres(){
        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");

        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();

        for (int i =0; i<10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0, 750)");
        }
    }

    @Test
    public void scroll_using_jsExecuter2(){
        Driver.getDriver().get("http://practice.cybertekschool.com/large");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        WebElement cyberetekSchoolLink = Driver.getDriver().findElement(By.linkText("Cybertek School"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

        js.executeScript("arguments[0].scrollIntoView(true)",cyberetekSchoolLink);
        js.executeScript("arguments[0].scrollIntoView(true)",homeLink);


    }
}
