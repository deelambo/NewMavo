package com.ThaThrowdown;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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


        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.close();

    }
}