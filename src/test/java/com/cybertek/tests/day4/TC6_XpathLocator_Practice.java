package com.cybertek.tests.day4;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC6_XpathLocator_Practice {
    public static void main(String[] args) {

        //TC #6: XPATH LOCATOR practice
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to http://practice.cybertekschool.com/multiple_buttons
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //3. Click on Button 1
        WebElement button1 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        button1.click();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //4. Verify text displayed is as expected:
        // Expected: “Clicked on button one!”
        String expectedText = "Clicked on button one!";
        String actualText = resultText.getText();

        if (actualText.equals(expectedText)){
            System.out.println("Result text verification PASSED");
        } else {
            System.out.println("Result text verification FAILED");
        }


    }
}
