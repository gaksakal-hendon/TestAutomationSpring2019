package com.cybertek.day4;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    public static void main(String[] args) throws Exception {
        // this line replaces System.setProperty()
        WebDriverManager.chromedriver().setup();//setup webdriver
        WebDriver driver = new ChromeDriver();//create object of chrome
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement emailInputBox = driver.findElement(By.name("email"));
        Faker faker= new Faker();
        emailInputBox.sendKeys(faker.funnyName()+"@gmail.com" + Keys.ENTER);
        Thread.sleep(3000);

        driver.close();

    }
}