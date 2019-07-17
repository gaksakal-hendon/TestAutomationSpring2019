package com.cybertek.day6;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class RadioButtonsTest {
    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {
        //test1();
          test2();
    }
    public static void openRadioButtonPage() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/radio_buttons");
    }
    //let's check if blue radio is selected
    public static void test1() {
        WebElement blueBtn = driver.findElement(By.id("blue"));
        if (blueBtn.isSelected()) {
            System.out.println("PASSED");

        } else {
            System.out.println("FAILD");
        }
        SeleniumUtils.waitPlease(2);
    }
    //let's check that green button is disabled, that means not clickable
    public static void test2() {
        WebElement blackBtn = driver.findElement(By.id("black"));
        WebElement greenBtn = driver.findElement(By.id("green"));
        if (blackBtn.isEnabled() && (!greenBtn.isEnabled())) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
        SeleniumUtils.waitPlease(2);

    }
    /* write a test(method) that

     */
    public static void test3(){

    }

}