package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VYTrackUtils {
    private static String usernamelocator = "prependedInput";
    private static String passwordlocator ="prependedInput2";

    public static void login(WebDriver driver,String username, String password){
      driver.findElement(By.id(usernamelocator)).sendKeys(username);



    }
}
