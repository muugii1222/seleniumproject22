package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_FacebookIncorrectLoginTitleVerification {
    public static void main(String[] args) throws InterruptedException {

        //TC #2: Facebook incorrect login title verification

        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        // 3.Enter incorrect username
        driver.findElement(By.name("email")).sendKeys("muugii9999@yahoo.com");

        // 4.Enter incorrect password
        driver.findElement(By.id("pass")).sendKeys("coffee999" + Keys.ENTER);

        // 5.Verify title changed to:
        // Expected: “Log into Facebook”
        String expectedTitle = "Log into Facebook";

        //Freezing the code for 5 secs so that Chrome browser can catch up with loading the page
        Thread.sleep(3000);

        String actualTitle = driver.getTitle();


        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification PASSED!");
        } else {
            System.out.println("Title is not as expected. Verification FAILED!");
        }
    }
}
