package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerification {
    public static void main(String[] args) {

        // TC #3: Back and forth navigation

        WebDriverManager.chromedriver().setup();

        //1- Open a chrome browser
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Click to Gmail from top right.
//        driver.findElement(By.linkText("Gmail")).click();
        driver.findElement(By.partialLinkText("mail")).click(); //inspect chrome find link txt from gmail then click

        //4- Verify title contains:
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title is as expected. Verification PASSED!");
        } else {
            System.out.println("Title is not as expected. Verification FAILED!");
        }

        //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        String expectedTitle1 = "Google";
        String actualTitle1 = driver.getTitle();

        if (actualTitle1.equals(expectedTitle1)){
            System.out.println("Title is as expected. Verification PASSED!");
        } else {
            System.out.println("Title is not as expected. Verification FAILED!");
        }

        driver.close();

    }
}
