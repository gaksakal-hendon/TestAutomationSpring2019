package com.cybertek.homework;/*

1. As a user, I should not be able to log in on Practice website with an invalid credential

 Verify that user can not log in with an invalid credential
*/

import com.github.javafaker.Faker;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class practice2 {
    public static void main(String[] args) throws Exception{


    WebDriver driver;
    Faker faker=new Faker();

        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\selenium dependence\\drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys(faker.name().username());
        driver.findElement(By.name("password")).sendKeys(faker.internet().password()+ Keys.ENTER);
        String expected="Your username is invalid!";
        String actual = driver.findElement(By.id("flash")).getText();
        Assert.assertEquals(actual.contains(expected),true);

        driver.close();
    }

}
