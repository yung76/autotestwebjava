package com.sample.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class WebDriverManager {

    private static final Logger logger =  LogManager.getLogger(WebDriverManager.class);
    private  WebDriver driver;

    public  WebDriver getDriver() {
        if (driver == null) {
            // Configura el driver si aún no está inicializado
            System.setProperty("webdriver.gecko.driver", "." + File.separator + "src"
                    + File.separator + "test"
                    + File.separator + "resources" + File.separator + "drivers" + File.separator + "geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    // Método de espera explícita
    protected void waitForElementToBeVisible(WebElement element) {
        logger.info("Buscando elemento");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected void waitForElementToBeVisible(WebElement element, int time) {
        logger.info("Buscando elemento");
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void quitDriver() {
        // Cierra el navegador y establece el driver a null
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
