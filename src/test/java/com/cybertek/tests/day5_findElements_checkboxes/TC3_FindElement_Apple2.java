package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC3_FindElement_Apple2 {
    public static void main(String[] args) {

        //TC #03: FINDELEMENTS_APPLE

        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2.Go to https://www.apple.com
        driver.get("https://www.apple.com");

        // 3.Click to all of the headers one by one
        // a.Mac, iPad, iPhone, Watch, TV, Music, Support

        List<WebElement> headers = driver.findElements(By.xpath("//a[contain(@class, 'ac-gn-link ac-gn-link-')]"));
        System.out.println(headers);
        for (WebElement each : headers) {
            each.click();
        }






//        driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-mac']")).click();
//        // 4.Print out the titles of the each page
//        System.out.println(driver.getTitle());
//        // 5.Print out total number of links in each page
//        List<WebElement> listOfLinksMac = driver.findElements(By.xpath("//body//a"));
//        System.out.println("Total number of links in Mac: " + listOfLinksMac.size());
//
//        driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-ipad']")).click();
//        System.out.println(driver.getTitle());
//        List<WebElement> listOfLinksIpad = driver.findElements(By.xpath("//body//a"));
//        System.out.println("Total number of links in iPad: " + listOfLinksIpad.size());
//
//        driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-iphone']")).click();
//        System.out.println(driver.getTitle());
//        List<WebElement> listOfLinksIphone = driver.findElements(By.xpath("//body//a"));
//        System.out.println("Total number of links in iPhone: " + listOfLinksIphone.size());
//
//        driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-watch']")).click();
//        System.out.println(driver.getTitle());
//        List<WebElement> listOfLinksWatch = driver.findElements(By.xpath("//body//a"));
//        System.out.println("Total number of links in Watch: " + listOfLinksWatch.size());
//
//        driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-tv']")).click();
//        System.out.println(driver.getTitle());
//        List<WebElement> listOfLinksTv = driver.findElements(By.xpath("//body//a"));
//        System.out.println("Total number of links in Tv: " + listOfLinksTv.size());
//
//        driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-music']")).click();
//        System.out.println(driver.getTitle());
//        List<WebElement> listOfLinksMusic = driver.findElements(By.xpath("//body//a"));
//        System.out.println("Total number of links in Music: " + listOfLinksMusic.size());
//
//        driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-support']")).click();
//        System.out.println(driver.getTitle());
//        List<WebElement> listOfLinksSupport = driver.findElements(By.xpath("//body//a"));
//        System.out.println("Total number of links in Support: " + listOfLinksSupport.size());

        // 6.While in each page:
        // a.Print out how many link is missing textTOTAL
        // b.Print out how many link has textTOTAL
    }
}
