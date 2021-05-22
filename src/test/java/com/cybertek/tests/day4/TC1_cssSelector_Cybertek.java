package com.cybertek.tests.day4;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1_cssSelector_Cybertek {
    public static void main(String[] args) {

        //TC #1: PracticeCybertek.com_ForgotPassword WebElement verification

        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)

        //a. “Home” link
        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
//        WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link")); same

        //b. “Forgot password” header
        WebElement forgotPasswordHeader = driver.findElement(By.tagName("h2"));

        //c. “E-mail” text
        WebElement emailText = driver.findElement(By.cssSelector("label[for='email']"));

        //d. E-mail input box
        WebElement emailInputBox = driver.findElement(By.cssSelector("input[type='text']"));

        //e. “Retrieve password” button
        WebElement retrievePasswordButton = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));

        //f. “Powered by Cybertek School” text
        WebElement cybertekSchool = driver.findElement(By.cssSelector("div[style='text-align: center;']"));

        //4. Verify all WebElements are displayed.

        System.out.println(homeLink.isDisplayed());
        System.out.println(forgotPasswordHeader.isDisplayed());
        System.out.println(emailText.isDisplayed());
        System.out.println(emailInputBox.isDisplayed());
        System.out.println(retrievePasswordButton.isDisplayed());
        System.out.println(cybertekSchool.isDisplayed());

        driver.close();

    }
}
