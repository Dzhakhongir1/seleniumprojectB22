package com.cybertek.utilities;

//task New Method creation
//metthod name is get driver
//static
//accept String browserType
//this argument willl determen what type of browser will open
//if chrome passed
//if firefox passed
//return type web Driver


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

        public static WebDriver getDriver (String browserType){

            if (browserType.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();

                return new ChromeDriver();
            } else if (browserType.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            }else{
                System.out.println("Given browser type does not exist");
                return null;
            }


    }

    public static void main(String[] args) {
        getDriver("chrome");
    }
}
