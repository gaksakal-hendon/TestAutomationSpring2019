package com.cybertek.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vy_tract {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\selenium dependence\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("prependedInput")).sendKeys("user197");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        driver.findElement(By.id("user-menu")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Logout")).click();
        driver.close();

    }
}
