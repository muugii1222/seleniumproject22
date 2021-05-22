package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekUrlVerification {
    public static void main(String[] args) {

    //TC #2: Cybertek practice tool verifications

        WebDriverManager.chromedriver().setup();

    //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

    //2. Go to https://practice.cybertekschool.com

        driver.get("http://practice.cybertekschool.com");

    //3. Verify URL contains Expected: cybertekschool

        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "cybertekschool";

        if (currentUrl.contains(expectedUrl)){
            System.out.println("URL is as expected. Verification PASSED!");
        } else {
            System.out.println("URL is not as expected. Verification FAILED!");
        }

    //4. Verify title:
    // Expected: Practice

        String currentTitle = driver.getTitle();
        String expectedTitle = "Practice";

        if (currentTitle.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification PASSED!");
        } else {
            System.out.println("Title is not as expected. Verification FAILED!");
        }

    }
}
