package com.cybertek.tests.PraacticeOutsideOfTheClass;

import com.cybertek.pages.VyTruckPages;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VytruckAs5 {
    @Test
    public void GridOnTheLeftSide() {
        VyTruckPages log = new VyTruckPages();
        log.logIn();
        log.dropDownHandle();
        String leftSideGrid = log.gridLeftSideParentLocator.getAttribute("class");
        Assert.assertTrue(leftSideGrid.contains("left"));

    }



    }

