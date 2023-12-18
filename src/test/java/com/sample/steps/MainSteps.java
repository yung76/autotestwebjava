package com.sample.steps;

import com.sample.pages.MainPage;
import com.sample.pages.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class MainSteps {

    private static final Logger logger =  LogManager.getLogger(MainSteps.class);

    private MainPage mainPage;
    private Scenario scenario;
    private WebDriverManager webDriverManager;

    private WebDriver driver;

    public MainSteps() {
        mainPage = new MainPage();
    }

    @Given("I open the Firefox browser")
    public void openFirefoxBrowser() {
        mainPage.getDriver();
    }

    @When("I navigate to {string}")
    public void navigateToUrl(String url) {
        mainPage.getDriver().get(url);
    }

    @Then("select first product of result search")
    public void verifyTitle() throws InterruptedException {
        mainPage.inputUser();
    }

    @Then("search a product")
    public void searchProduct() {
       //
    }

    @After
    public void closeApp() {
        logger.info("Se cierra la Session");
        mainPage.quitDriver();
    }

}
