package com.cybertek.day8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DropDownTests {
    WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }@BeforeMethod
    public void setUp(){
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @Test
    public void test1(){
        int expectedYear = 2019;
        String expectedMonth = "july";
        int expctedDay= 7;
        Select selectYear = new Select(driver.findElement(org.openqa.selenium.By.id("year")));
        Select selectMonth = new Select(driver.findElement(By.id("mounth")));

        Select selectDay= new Select(driver.findElement(By.id("day")));
        int actualYear = Integer.parseInt(selectYear.getFirstSelectedOption().getText());
        String actualMonth= selectMonth.getFirstSelectedOption().getText();
        int actualDay= Integer.parseInt(selectDay.getFirstSelectedOption().getText());
        Assert.assertEquals(actualDay,expctedDay);
        Assert.assertEquals(actualMonth,expectedMonth);
        Assert.assertEquals(actualYear,expectedYear);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
