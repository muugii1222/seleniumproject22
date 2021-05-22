package com.cybertek.tests.day3_review_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_basic_login_authentication {
    public static void main(String[] args) {

        //TC #5: Basic login authentication

        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //3- Verify title equals:
        //Expected: Web Orders Login
        String expectedTitle1 = "Web Orders Login";
        String actualTitle1 = driver.getTitle();

        if (actualTitle1.equals(expectedTitle1)){
            System.out.println("Title is as expected. Verification PASSED!");
        } else {
            System.out.println("Title is not as expected. Verification FAILED!");
        }

        //4- Enter username: Tester
        WebElement inputUserName = driver.findElement(By.className("txt"));
        inputUserName.sendKeys("Tester");

        //5- Enter password: test
        WebElement inputUserPassword = driver.findElement(By.id("ctl00_MainContent_password"));
        inputUserPassword.sendKeys("test" + Keys.ENTER);

        //6- Click “Sign In” button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        //7- Verify title equals:
        //Expected: Web Orders

        String expectedTitle2 = "Web Orders";
        String actualTitle2 = driver.getTitle();

        if (actualTitle2.equals(expectedTitle2)){
            System.out.println("Title is as expected. Verification PASSED!");
        } else {
            System.out.println("Title is not as expected. Verification FAILED!");
        }
    }
}
