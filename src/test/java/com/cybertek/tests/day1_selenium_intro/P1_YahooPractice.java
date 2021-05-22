package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_YahooPractice {
    public static void main(String[] args) {


//        TC #1: Yahoo Title Verification
//        1- set up the web driver
        WebDriverManager.chromedriver().setup();

//        1. Open Chrome browser
//        this line opens empty browser
        WebDriver driver = new ChromeDriver();

//        maximize browser
        driver.manage().window().maximize();

//        2. Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

//        3. Verify title:
//        Expected: Yahoo
        String expectedTitle = "Yahoo";

//        actual title
        String actualTitle = driver.getTitle();
        System.out.println();

//        creating our verification
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification PASSED!");
        } else {
            System.out.println("Title is not as expected. Verification FAILED!");
        }

//        closing the browser
        driver.close();








    }
}
