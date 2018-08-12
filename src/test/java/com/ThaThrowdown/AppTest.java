package com.ThaThrowdown;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

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
    public void launchBrowser() throws MalformedURLException {

       // System.setProperty("webdriver.chrome.driver","https://github.com/deelambo/NewMavo.git/Driver");
       // WebDriver driver = new ChromeDriver();
        DesiredCapabilities capabilities= DesiredCapabilities.chrome();
        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"),capabilities);
        driver.get("https://google.com");
        driver.close();

    }
}
