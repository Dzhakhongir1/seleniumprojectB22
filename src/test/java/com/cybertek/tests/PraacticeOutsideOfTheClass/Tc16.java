package com.cybertek.tests.PraacticeOutsideOfTheClass;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Tc16 {
    @Test
    public void dragAndDrop(){
        //1.Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        // 2.Drag and drop the small circle to bigger circle.
        WebElement small = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
        BrowserUtils.sleep(2);
        WebElement click1 = Driver.getDriver().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        click1.click();
        WebElement big = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));
        BrowserUtils.sleep(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(small,big).perform();
        // 3.Assert: -Text in big circle changedto: “You did great!”
        String actual = big.getText();
        String expected= "You did great!";
        Assert.assertTrue(actual.contains(expected));



    }
}
