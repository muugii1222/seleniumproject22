package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_EtsySearch_TitleVerification {
    public static void main(String[] args) {

    //TC #1: Etsy Title Verification

    //1. Open Chrome browser
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

    //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com/");

    //3. Search for “wooden spoon”
        //1. we need to locate the search bar
        //2. enter search value
        //3.press enter
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon" + Keys.ENTER); //find search box's id from inspection

    //4. Verify title:
    //Expected: “Wooden spoon | Etsy”

        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification PASSED!");
        } else {
            System.out.println("Title is not as expected. Verification FAILED!");
        }
    }
}
