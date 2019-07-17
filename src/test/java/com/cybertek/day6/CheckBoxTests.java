package com.cybertek.day6;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxTests {
    static WebDriver driver= BrowserFactory.getDriver("chrome");
    public static void main(String[] args) {

    }
    public static void test1(){

    }
    /*

     */
    public static void openPage(String page, WebDriver driver){
        // we will find all examples on the home page
        List<WebElement> listOfExamples= driver.findElements(By.tagName("a"));
        for( WebElement example: listOfExamples){
            if(example.getText().contains(page)){
                example.click();
                break;
            }

        }

    }
}
