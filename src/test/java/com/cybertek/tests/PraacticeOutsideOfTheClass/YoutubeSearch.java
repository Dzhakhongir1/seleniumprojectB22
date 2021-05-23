package com.cybertek.tests.PraacticeOutsideOfTheClass;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class YoutubeSearch {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");
        WebElement searchnox = driver.findElement(By.xpath("//input[@id='search']"));
        searchnox.sendKeys("Blue - One Love");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        searchnox.submit();
        WebElement music = driver.findElement(By.xpath("//yt-formatted-string[@aria-label='Blue - One Love (Official Music Video) by Relie Helei 4 years ago 3 minutes, 32 seconds 1,095,826 views']"));
        music.click();

    }
}
