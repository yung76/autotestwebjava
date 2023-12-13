package com.sample.steps;

import com.sample.pages.MainPage;
import com.sample.pages.WebDriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class MainSteps {

    private MainPage mainPage;
    private Scenario scenario;
    private WebDriverManager webDriverManager;

    private WebDriver driver;

    public MainSteps() {
        mainPage = new MainPage();
    }

    @Given("I open the Chrome browser")
    public void openChromeBrowser() {
       // webDriverManager.getDriver().get(url);


    }

    @When("I navigate to {string}")
    public void navigateToUrl(String url) {
        mainPage.getDriver().get(url);
    }

    @Then("the title should be {string}")
    public void verifyTitle(String expectedTitle) throws InterruptedException {
        //String actualTitle = webDriverManager.getDriver().getTitle();
       // System.out.println("-actualTitle---"+actualTitle);
        //System.out.println("---expectedTitle-"+expectedTitle);
        mainPage.inputUser();

       // assert actualTitle.equals(expectedTitle) : "Actual title: " + actualTitle;
    }

    @Then("close the browser")
    public void closeBrowser() {
        mainPage.quitDriver();
    }
}
