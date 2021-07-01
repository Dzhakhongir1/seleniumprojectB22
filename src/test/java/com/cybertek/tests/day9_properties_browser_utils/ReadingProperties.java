package com.cybertek.tests.day9_properties_browser_utils;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
    @Test
    public void reading_from_properties_file() throws IOException {
        //create object of Properties class (coming from java lib)
        Properties properties = new Properties();

        //#2- open the file using FileInputStream
        //we are trying to open a file , so we need to pass a path
        FileInputStream file =new FileInputStream("configuration.properties");

        //#3- load the properties with our file
        properties.load(file);
        //read from configuration.properties
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
    }
}
