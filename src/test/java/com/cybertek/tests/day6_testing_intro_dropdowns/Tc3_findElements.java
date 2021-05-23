package com.cybertek.tests.day6_testing_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Tc3_findElements {
    public static void main(String[] args) {
        /**
         * TC #03: FINDELEMENTS_APPLE
         * 1. Open Chrome browser
         * 2. Go to https://www.apple.com/
         * 3. Click to all of the headers one by one
         * a. Mac, iPad, iPhone, Watch, TV, Music, Support
         * 4. Print out the titles of the each page
         * 5. Print out total number of links in each page
         * 6. While in each page:
         * a. Print out how many link is missing text TOTAL
         * b. Print out how many link has text TOTAL
         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        TC #03: FINDELEMENTS_APPLE
//         * 1. Open Chrome browser
//         * 2. Go to https://www.apple.com/
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.apple.com");
//        * 3. Click to all of the headers one by one
//        * a. Mac, iPad, iPhone, Watch, TV, Music, Support
        List<WebElement> headerLinks =driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

        for (int eachLink = 1; eachLink <headerLinks.size()-1 ; eachLink++) {
           // System.out.println(headerLinks.get(eachLink).getText());
            headerLinks.get(eachLink).click();
            headerLinks =driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
//        * 4. Print out the titles of the each page
            System.out.println("current title "+ driver.getTitle());
//        * 5. Print out total number of links in each page
            List<WebElement>allLinks = driver.findElements(By.xpath("//body//a"));
            System.out.println("Number of links in current page "+allLinks.size());

        }
//        * 4. Print out the titles of the each page
//        * 5. Print out total number of links in each page
//        * 6. While in each page:
//        * a. Print out how many link is missing text TOTAL
//        * b. Print out how many link has text TOTAL

    }
}
