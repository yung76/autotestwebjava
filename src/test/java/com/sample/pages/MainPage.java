package com.sample.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends WebDriverManager{

    private static final Logger logger =  LogManager.getLogger(MainPage.class);
    // Constructor
    public MainPage() {
        PageFactory.initElements(getDriver(), this);
    }

    // Elementos de la página con @FindBy
    @FindBy(id = "pts-mainnav")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    // Métodos para interactuar con los elementos
    public void inputUser() throws InterruptedException {
        logger.info("Accediendo a la pagina");
        waitForElementToBeVisible(usernameInput);
        usernameInput.isDisplayed();
        logger.info("Funco");

    }

    public void inputPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void hacerLogin() {
        loginButton.click();
    }
}
