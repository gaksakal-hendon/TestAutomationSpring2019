package com.cybertek.day5;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LocatorsPracticeID {
    public static void main(String[] args) throws Exception{
        //test1();
          test2();

    }
//negative
static WebDriver driver = BrowserFactory.getDriver("chrome");
    public static void test1() throws Exception{
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.id("woodenspoon")).click();
       Thread.sleep(3000);
        driver.quit();
    }
public static void test2()throws Exception{
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.id("wooden_spoon")).click();
        Thread.sleep(3000);
        String expectedMessage ="Welcome to the Secure Area. When you are done clik logout below.";
        String actualMessage = driver.findElement(By.className("subheader")).getText();
        SeleniumUtils.verifyEquals(expectedMessage, actualMessage);
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(3000);
        driver.quit();

}
}
