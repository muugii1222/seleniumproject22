package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC0_FindElement_Merriam {
    public static void main(String[] args) {

        //TC #0: FINDELEMENTS

        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2.Go to https://www.merriam-webster.com/
        driver.get("https://www.merriam-webster.com/");

        // 3.Print out the texts of all links
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));
        for (WebElement each : listOfLinks) {
            System.out.println(each.getText());
        }

        // 4.Print out how many link is missing text
        // 5.Print out how many link has text
        int linksWithoutText = 0;
        int linksWithText = 0;

        for (WebElement each : listOfLinks) {
            if (each.getText().isEmpty()){
                linksWithoutText++;
            } else {
                linksWithText++;
            }

        }
        System.out.println("Links without text = " + linksWithoutText);
        System.out.println("Link with text = " + linksWithText);

        // 6.Print out how many total link
        System.out.println("Total links" + listOfLinks.size());
    }
}
