package com.cybertek.day6;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;
/*go yo amazon
enter any search term
click on search button
verify title contains search term

 */

public class AmozonSearchButton {
    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) throws Exception{
        test1();
    }
    public static void test1()throws Exception{
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.amazon.co.uk/");
        Thread.sleep(3000);
        driver.findElement(By.id("nav-search-keywords")).sendKeys("book");
        driver.findElement(By.className("nav-input")).click();
        String title= driver.getTitle();
        if (title.contains("book")){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
        driver.close();
    }
    public static void test2() throws Exception {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.id("searchInput")).sendKeys("selenium webDriver", Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.id("ooui-php-1")).click();
        Thread.sleep(3000);
        String url = driver.getCurrentUrl();
        if(url.endsWith("x")){
            System.out.println("passed");

        }else {
            System.out.println("failed");
        }
        driver.close();
    }
}
