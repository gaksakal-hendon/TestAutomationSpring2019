package com.cybertek.homework;

import com.github.javafaker.Faker;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class practice {
    WebDriver driver;
    Faker faker=new Faker();

    @BeforeClass
    public  void bc(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Remzi\\Documents\\Selenium Depencies\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test1(){
        driver.findElement(By.name("username")).sendKeys(faker.name().username());
        driver.findElement(By.name("password")).sendKeys(faker.internet().password()+ Keys.ENTER);
        String expected="Your username is invalid!";
        String actual = driver.findElement(By.id("flash")).getText();
        Assert.assertEquals(actual.contains(expected),true);
    }

    @AfterClass
    public void ac(){
        driver.quit();
    }
}