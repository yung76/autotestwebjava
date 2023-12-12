package com.sample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class WebDriverManager {

    private  WebDriver driver;

    public  WebDriver getDriver() {
        if (driver == null) {
            // Configura el driver si aún no está inicializado
            System.setProperty("webdriver.chrome.driver", "." + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "drivers" + File.separator + "chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public void quitDriver() {
        // Cierra el navegador y establece el driver a null
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
