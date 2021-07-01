package com.cybertek.tests.day12_actions_upload_jsexecuter;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadPractice {

    @Test
    public void upload_test(){
        //1.Go to http://practice.cybertekschool.com/upload
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        // 2.Find some small file from your computer, and get the path of it.
        String path = "C:\\Users\\Jaha\\Pictures\\Saved Pictures\\IMG_0877.JPG";
        // 3.Upload the file.
        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));

        WebElement fileSubmit = Driver.getDriver().findElement(By.id("file-submit"));

        BrowserUtils.sleep(3);
        chooseFile.sendKeys(path);
        fileSubmit.click();

        // 4.Assert: -Fileuploaded text is displayed on the page

        WebElement fileUploadedMessage = Driver.getDriver().findElement(By.xpath("//h3[.='File Uploaded!']"));

        Assert.assertTrue(fileUploadedMessage.isDisplayed());
    }
}
