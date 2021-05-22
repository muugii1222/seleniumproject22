package com.cybertek.tests.Group;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.bing.com/");

        // task1 -> Verify Title
        String expectedTitle1 = "Bing";
        String actualTitle1 = driver.getTitle();

        if (actualTitle1.equals(expectedTitle1)){
            System.out.println("Title is as expected. Verification PASSED!");
        } else {
            System.out.println("Title is not as expected. Verification FAILED!");
        }

        //task2 -> Verify URL
        String expectedUrl = "bing";
        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.contains(expectedUrl)){
            System.out.println("URL is as expected. Verification PASSED!");
        } else {
            System.out.println("URL is not as expected. Verification FAILED!");
        }

        //task3 -> sign in title verification
        Thread.sleep(3000); //browser needs little more time to load
        driver.findElement(By.id("id_s")).click();

        String expectedTitle2 = "Sign in to Bing";
        Thread.sleep(2000);
        String actualTitle2 = driver.getTitle();


        if (actualTitle2.equals(expectedTitle2)){
            System.out.println("Title is as expected. Verification PASSED!");
        } else {
            System.out.println("Title is not as expected. Verification FAILED!");
        }

        //task4 -> go back verify title again
        driver.navigate().back();

        String expectedTitle3 = "Bing";
        String actualTitle3 = driver.getTitle();

        if (actualTitle3.equals(expectedTitle3)){
            System.out.println("Title is as expected. Verification PASSED!");
        } else {
            System.out.println("Title is not as expected. Verification FAILED!");
        }

        //task5 -> Write "java" in search box & verify title
        driver.findElement(By.id("sb_form_q")).sendKeys("Java" + Keys.ENTER); //search box is key sensitive

        String expectedTitle4 = "Java - Bing";
        String actualTitle4 = driver.getTitle();

        if (actualTitle4.equals(expectedTitle4)){
            System.out.println("Title is as expected. Verification PASSED!");
        } else {
            System.out.println("Title is not as expected. Verification FAILED!");
        }

        //task6 -> click on Microsoft logo & verify title
        driver.findElement(By.className("b_logo")).click();

        String expectedTitle5 = "Bing";
        String actualTitle5 = driver.getTitle();

        if (actualTitle5.equals(expectedTitle5)){
            System.out.println("Title is as expected. Verification PASSED!");
        } else {
            System.out.println("Title is not as expected. Verification FAILED!");
        }




    }
}
