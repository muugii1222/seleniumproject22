package com.cybertek.tests.Group;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmartBearSoftwareVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //1. Go to link
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String expectedTitle1 = "Web Orders Login";
        String actualTitle1 = driver.getTitle();

        if (actualTitle1.equals(expectedTitle1)){
            System.out.println("Title is as expected. Verification PASSED!");
        } else {
            System.out.println("Title is not as expected. Verification FAILED!");
        }

        //2. Enter user name as Tester
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");

        //3. Enter password as test and press enter
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

        //4. Click login button
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();

        //5. Verify title
        String expectedTitle2 = "Web Orders";
        String actualTitle2 = driver.getTitle();

        if (actualTitle2.equals(expectedTitle2)){
            System.out.println("Title is as expected. Verification PASSED!");
        } else {
            System.out.println("Title is not as expected. Verification FAILED!");
        }


    }
}
