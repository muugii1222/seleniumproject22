package com.cybertek.tests.Group;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aol {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.aol.com/");

        String expectedTitle = "AOL - News, Politics, Sports & Latest Headlines";
        String actualTitle = driver.getTitle();


        if (actualTitle.equals(expectedTitle)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");


            String expectedUrl = "aol";
            String actualUrl = driver.getCurrentUrl();


            if (actualUrl.contains(expectedUrl)) {
                System.out.println("PASSED");
            } else {
                System.out.println("FAILED");

            }
        }
    }
}