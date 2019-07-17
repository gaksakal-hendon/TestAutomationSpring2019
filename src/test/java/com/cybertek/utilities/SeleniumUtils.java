package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumUtils {
    public static void verifyEquals() {
    }

    /*@param expectedResult
        @param actualResult
        verifies if two strings are equals

         */
    public static void verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("passed");
        } else {
            System.out.println("Failed");
            System.out.println("expected result: " + expectedResult);
            System.out.println("Actual result: " + actualResult);
        }
    }

    public static void waitPlease(int second) {
        try {
            Thread.sleep(1000);

        }catch (Exception e){
            System.out.println(e.getMessage());
    }
}


}
