package com.cybertek.tests.Group;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FindLocatorPractice {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/?tag=amazusnavi-20&hvadid=381823327672&hvpos=&hvnetw=g&hvrand=5436750066695915516&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9021541&hvtargid=kwd-10573980&ref=pd_sl_7j18redljs_e&hydadcr=28883_11845445&gclid=EAIaIQobChMI65-Jjd3Q8AIVhI5bCh0bCQnpEAAYASAAEgLvn_D_BwE");

        //  #1- id
        driver.findElement(By.id("searchDropdownBox")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("girl's leotard" + Keys.ENTER);

        //	#2- className
        //	#3- tagName
        //	#4- name
        //	#5- linkText
        //	#6- partialLinkText


    }
}
