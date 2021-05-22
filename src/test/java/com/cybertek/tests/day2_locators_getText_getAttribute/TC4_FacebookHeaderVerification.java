package com.cybertek.tests.day2_locators_getText_getAttribute;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC4_FacebookHeaderVerification {
    public static void main(String[] args) {

        //TC #4: Facebook header verification

        // 1.Open Chrome browser
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();

        WebDriver driver = WebDriverFactory.getDriver("safari");

        // 2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        // 3.Verify “Create a page” link href value contains text:
        // Expected: “registration_form”
        String expectedLink = "registration_form";
        String actualLink = driver.findElement(By.className("_8esh")).getAttribute("href");

        if (actualLink.contains(expectedLink)){
            System.out.println("Link verification PASSED!");
        } else {
            System.out.println("Link verification FAILED!");
        }
    }
}
