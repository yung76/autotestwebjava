package com.sample.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
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
    WebElement imgLogo;

    @FindBy(xpath = "//div[@class=\"block-search\"]")
    WebElement btnSearch;

    @FindBy(id = "search_query_top")
    WebElement inputSearch;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    @FindBy(xpath = "(//div[@class=\"product-meta\"])[1]")
    WebElement firstProductList;

    // Métodos para interactuar con los elementos
    public void inputUser() throws InterruptedException {
        logger.info("Accediendo a la pagina");
        waitForElementToBeVisible(imgLogo);
        imgLogo.isDisplayed();
        logger.info("Funco");
    }

    public void setInputSearch(String search) {
        logger.info("Buscando btnSearch");
        waitForElementToBeVisible(btnSearch);
        btnSearch.click();
        logger.info("Buscando inputSearch");
        waitForElementToBeVisible(inputSearch);

        inputSearch.sendKeys(search);
        logger.info("Presione enter");
        inputSearch.sendKeys(Keys.ENTER);
    }

    public void clickFirstProductList() {

        logger.info("Buscando firstProductList");
        waitForElementToBeVisible(firstProductList);
        firstProductList.click();
    }

    public void hacerLogin() {
        loginButton.click();
    }
}
