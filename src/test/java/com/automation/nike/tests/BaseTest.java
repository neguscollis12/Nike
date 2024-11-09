package com.automation.nike.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public abstract class BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver" , "/Users/neguscollis/Desktop/Coding/Nike/src/test/resources/driver/chromedriver");
        driver.get("https://www.nike.com");
        driver.manage().window().maximize();



    }


    @AfterMethod
    public void cleanUp(){
        //driver.quit();
    }


}
