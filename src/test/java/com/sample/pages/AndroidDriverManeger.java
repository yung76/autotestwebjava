package com.sample.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class AndroidDriverManeger {
    private static final Logger logger =  LogManager.getLogger(AndroidDriverManeger.class);
    public  AppiumDriver driver;

    public AppiumDriver getAndroidDriver() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("autoGrantPermissions", "true");
        desiredCapabilities.setCapability("appWaitActivity", "");
        desiredCapabilities.setCapability("app", "localAppPath");
        desiredCapabilities.setCapability("udid", "localDeviceId");
        URL localurl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(localurl, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        return driver;
    }

}
