package com.sample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {


    // Constructor
    public MainPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    // Elementos de la página con @FindBy
    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    // Métodos para interactuar con los elementos
    public void inputUser(String usuario) {
        usernameInput.sendKeys(usuario);
    }

    public void inputPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void hacerLogin() {
        loginButton.click();
    }
}
