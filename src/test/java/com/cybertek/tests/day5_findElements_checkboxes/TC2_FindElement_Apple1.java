package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC2_FindElement_Apple1 {
    public static void main(String[] args) {

        //TC #02: FINDELEMENTS_APPLE

        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2.Go to https://www.apple.com
        driver.get("https://www.apple.com");

        // 3.Click to iPhone
        driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']")).click();

        // 4.Print out the texts of all links
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));
        for (WebElement each : listOfLinks) {
            System.out.println(each.getText());
        }

        // 5.Print out how many link is missing text
        // 6.Print out how many link has text
        int linkWithoutText = 0;
        int linkWithText = 0;

        for (WebElement each : listOfLinks) {
            if (each.getText().isEmpty()){
                linkWithoutText++;
            } else {
               linkWithText++;
            }
        }
        System.out.println("Links without text = " + linkWithoutText);
        System.out.println("Link with text = " + linkWithText);

        // 7.Print out how many total link
        System.out.println("Total links = " + listOfLinks.size());
    }
}
