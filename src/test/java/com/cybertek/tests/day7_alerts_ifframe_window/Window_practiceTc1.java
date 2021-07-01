package com.cybertek.tests.day7_alerts_ifframe_window;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
/*
1. Create	a	new	class	called:	WindowHandlePractice
2. Create	new	test	and	make	set	ups
3. Go	to	:	http://practice.cybertekschool.com/windows
4. Assert:	Title	is	“Practice”
5. Click	to:	“Click	Here” text
6. Switch	to	new	Window.
7. Assert:	Title	is	“New	Window”
 */
public class Window_practiceTc1 {
    WebDriver driver;
    @BeforeMethod
    public  void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");

    }
    @Test
    public void WindowTc1(){
        String actualTitle1 = driver.getTitle();
        String expectedTitleBeforeClick = "Practice";
        String mainHandle = driver.getWindowHandle();
        WebElement clickButton= driver.findElement(By.xpath("//a[@href='/windows/new']"));
        clickButton.click();
        String actualTitle2 = driver.getTitle();
        String expectedTitle = "New Window";
    }
}
