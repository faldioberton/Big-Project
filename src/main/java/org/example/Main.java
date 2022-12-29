package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    private static AppiumDriver driver;
    private static DesiredCapabilities capabilities;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Realme");
        capabilities.setCapability("udid", "bfb80eb1");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", "C:/Users/asus/Desktop/stagging.apk");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("appPackage", "staging.cicle");
        capabilities.setCapability("appActivity", "staging.cicle.MainActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, capabilities);
        //Thread.sleep(2000);
        //Thread.sleep(6000);
        // driver.quit();
    }
}