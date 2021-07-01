package com.cybertek.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OfficeHoursUtils {

    public static void productAdder(WebDriver driver,String category, String product){
        WebElement laptopLocation = driver.findElement(By.xpath("//a[.='"+category+"']"));
        laptopLocation.click();
        BrowserUtils.sleep(1);
        WebElement i5Location= driver.findElement(By.xpath("//a[.='"+product+"']"));
        i5Location.click();
        BrowserUtils.sleep(1);
        WebElement addToCard = driver.findElement(By.xpath("//a[.='Add to cart']"));
        addToCard.click();
        BrowserUtils.sleep(1);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();
    }
    public static void productRemover(WebDriver driver, String product){
    driver.findElement(By.xpath("//a[.='Cart']")).click();
    BrowserUtils.sleep(1);
    driver.findElement(By.xpath("//tbody//tr//td[.='"+product+"']//..//td[.='Delete']/a")).click();
    BrowserUtils.sleep(3);
    }
}
