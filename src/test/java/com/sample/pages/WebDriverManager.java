package com.sample.pages;

import com.sample.utils.RandomGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;

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

    public void captureScreenshot() {
        try {
            // Convertir el controlador de WebDriver a TakesScreenshot
            TakesScreenshot ts = (TakesScreenshot) driver;
            RandomGenerator randomGenerator = new RandomGenerator();

            // Capturar la captura de pantalla como un archivo
            File source = ts.getScreenshotAs(OutputType.FILE);

            // Definir la ruta donde se guardará la captura de pantalla
            File destino = new File("." + File.separator + "src"
                    + File.separator + "test"
                    + File.separator + "resources" + File.separator + "screenshot" + File.separator
                    + "screenshot_" + randomGenerator.generateRandomText(4) + ".png");

            // Copiar el archivo de origen al destino
            FileUtils.copyFile(source, destino);

            logger.info("Captura de pantalla tomada y guardada en: " + destino.getAbsolutePath());
        } catch (Exception e) {
            logger.error("Error al tomar la captura de pantalla: " + e.getMessage());
        }
    }

}
