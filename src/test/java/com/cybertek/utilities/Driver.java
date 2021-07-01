package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    /**
    creating private constructor so this class object is not rechable
     */
    private Driver(){}
    /*
    making our driver instance so that its not reachable from outside of the class we make it static
    because we want it to rin before everything else , and also we will use it in static method
     */
    private static WebDriver driver;
    /*
    creating re-usable utility method that will return same driver instace everytime we call it
     */
    public static WebDriver getDriver(){
        if (driver == null){
            //we read our browser type from configuration.propertris file ising
            //.get propertrires method we creating ConfigurationReader class.
            String browserType = ConfigurationReader.getProperty("browser");
            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }
        /*
        same driver instance will be returned every time we call.getDriver(); method
         */
        return driver;
    }
    /*
    this method makes sure we have some form of driver session or driver id has
    Ether null or not null ust exit
     */
    public static void closeDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
