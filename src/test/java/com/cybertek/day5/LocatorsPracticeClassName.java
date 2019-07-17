package com.cybertek.day5;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LocatorsPracticeClassName {
    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {
        test1();
    }
    public static void test1(){
        driver.manage().window().maximize();
        driver.get(("http://practice.cybertekschool.com/"));
        List<WebElement> examples= driver.findElements(By.className("List-group-item"));
        for (WebElement element: examples){
            System.out.println(element.getText());

        }

    }
}
