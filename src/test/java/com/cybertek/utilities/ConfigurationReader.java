package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
//int this class we will create method that will be reading from configuration.reader file
public class ConfigurationReader {
    //create properties objects
   private static Properties properties = new Properties();
   static {
       try {
           //load the file into fileInput Stream
           FileInputStream file =new FileInputStream("configuration.properties");
           //load properties objects withthe filee
           properties.load(file);
       } catch (IOException e) {
           System.out.println("File not found in configuration properties.");
       }

   }
   //use the obove created logic to create a Re-usable Static method
   public static String getProperty(String keyWord) {
       return properties.getProperty(keyWord);
   }

}
