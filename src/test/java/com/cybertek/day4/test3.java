package com.cybertek.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {
    public static void main(String[] args) throws Exception {
        // this line replaces System.setProperty()
        WebDriverManager.chromedriver().setup();//setup webdriver
        WebDriver driver = new ChromeDriver();//create object of chrome
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement emailInputBox = driver.findElement(By.name("email"));
        WebElement submitButton = driver.findElement(By.id("form_submit"));

        emailInputBox.sendKeys("sderpro3000@gmail.com");
        Thread.sleep(3000);
        System.out.println(emailInputBox.getAttribute("pattern"));
        System.out.println(emailInputBox.getAttribute("value"));

        submitButton.submit();
        //
        Thread.sleep(3000);

        driver.close();

    }
}