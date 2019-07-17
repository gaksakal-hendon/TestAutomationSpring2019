package com.cybertek.MentoringVYTrack;



import com.vytrack.utilities.Library;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations .*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class VyTrack {
    public class MenuOptionsTestDriver {

        WebDriver driver;
        String userName = "user180";
        String password = "UserUser123";
        String tabsXpath = "//span[@class='title title-level-1']";
        String modulesXpath = "//span[@class='title title-level-2']";

        @BeforeClass
        public void beforeClass() {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get("http://qa2.vytrack.com/user/login");
            Library.sleep(2);
            driver.findElement(By.id("prependedInput")).sendKeys(userName);
            driver.findElement(By.id("prependedInput2")).sendKeys(password, Keys.ENTER);
            Library.sleep(1);

        }

        @BeforeMethod
        public void beforeMethod() {
            Library.sleep(3);
        }

        @AfterMethod
        public void afterMethod() {
            Library.sleep(2);
        }

        @AfterClass
        public void afterClass() {
            driver.quit();
        }

        @Test
        public void verifyVehiclesPageName() {

            List<WebElement> fleeManagementTabs = driver.findElements(By.xpath(tabsXpath));
            List<WebElement> fleetModules = driver.findElements(By.xpath(modulesXpath));
            fleeManagementTabs.get(0).click();
            fleetModules.get(0).click();
            Library.sleep(3);
            String expectedPageName = "All Cars";
            String actualPageName = driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
            Assert.assertEquals(actualPageName, expectedPageName);
        }

        @Test
        public void verifyVehiclesTitle() {
            String expectedTitle = "Car - Entities - System - Car - Entities - System";
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle);
        }

        @Test
        public void verifyAccountsPageName() {

            List<WebElement> fleeManagementTabs = driver.findElements(By.xpath(tabsXpath));
            List<WebElement> fleetModules = driver.findElements(By.xpath(modulesXpath));
            fleeManagementTabs.get(1).click();
            fleetModules.get(7).click();
            Library.sleep(3);
            String expectedPageName = "Accounts";
            String actualPageName = driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
            Assert.assertEquals(actualPageName, expectedPageName);

        }


        @Test
        public void verifyAccountsTitle() {
            String expectedTitle = "Accounts - Customers";
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle);
        }


    }

}