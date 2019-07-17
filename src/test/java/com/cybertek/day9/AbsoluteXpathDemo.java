package com.cybertek.day9;

import com.cybertek.utilities.BrowserFactory;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class AbsoluteXpathDemo {
    WebDriver driver= BrowserFactory.getDriver("chrome");
    @BeforeClass
    public void setup(){
        driver.manage().window().maximize();

    }
}
