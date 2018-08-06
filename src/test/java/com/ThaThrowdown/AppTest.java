package com.ThaThrowdown;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }



    @Test
    public void launchBrowser(){

        System.setProperty("webdriver.chrome.driver","https://github.com/deelambo/NewMavo.git/Driver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.close();

    }
}
