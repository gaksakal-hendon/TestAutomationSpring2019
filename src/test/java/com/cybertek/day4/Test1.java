package com.cybertek.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) throws Exception{
        // this line replaces System.setProperty()
        WebDriverManager.chromedriver().setup();//setup webdriver
        WebDriver driver = new ChromeDriver();//create object of chrome
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement emailInputBox = driver.findElement(By.name("email"));
        emailInputBox.sendKeys("email@gmail.com");
        WebElement submitButton = driver.findElement(By.id("form_submit"));
        submitButton.click();
        Thread.sleep(2000);
        //let's find confirmation message and verify it
        WebElement confirmationMessage = driver.findElement(By.name("confirmation_message"));
        String expectedMessage = "your e-mail's been sent!";
        String actualMessage= confirmationMessage.getText();
        if (actualMessage.equals(expectedMessage)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
            System.out.println("Expected message: "+ expectedMessage);
            System.out.println("Actual message: "+ actualMessage);
            driver.close();
        }

    }
}
