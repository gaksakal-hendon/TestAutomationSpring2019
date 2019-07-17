package com.cybertek.day5;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsPracticeTagName {
    static WebDriver driver = BrowserFactory.getDriver("chrome");
    public static void main(String[] args)throws Exception {
        //here we will execute our tests
        //we will create separate method for every test
        test1();
    }
    //TASK: FIND ALL BUTTONS, put them in the list, and click on them one by one.
    public static void test1() throws Exception{
        driver.manage().window().maximize();
        //selenium will wait up to 30 second to find a element
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        // how to find all buttons?
        //we use findElemts to find multiple elements
        //then, we have to store them in the list
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        System.out.println("Size: "+buttons.size());//to know how many buttons we have
        for(WebElement button:buttons){
            System.out.println(button.getText());
            button.click();

            Thread.sleep(1000);
        }
        driver.close();

    }
}
