package com.cybertek.OfficeHours.OH_day04;

import com.cybertek.pages.amazonPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class AmazonTestWithPAgeObjectModel {
    //go to amazon

    @Test
    public void testAmazon(){
        Driver.getDriver().get(ConfigurationReader.getProperty("amazon"));
        BrowserUtils.sleep(1);
        amazonPage amazonPage1 = new amazonPage();
        List<WebElement> tabselement =amazonPage1.tabs;
//        for (int i = 0; i <tabselement.size() ; i++) {
//            if (tabselement.get(i).isDisplayed()){
//                System.out.println(tabselement.get(i).getText());
//                String Text= amazonPage1.tabs.get(i).getText();
//                amazonPage1.tab(Text).click();
//            }

        amazonPage1.searchBox.sendKeys(ConfigurationReader.getProperty("searchAmazon")+ Keys.ENTER);
    }
    }

