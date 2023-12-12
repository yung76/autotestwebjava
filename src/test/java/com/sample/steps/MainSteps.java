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

    @Given("I open the Chrome browser")
    public void openChromeBrowser() {
        System.setProperty("webdriver.gecko.driver", "." + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources" + File.separator + "drivers" + File.separator + "geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @When("I navigate to {string}")
    public void navigateToUrl(String url) {
        driver.get(url);
    }

    @Then("the title should be {string}")
    public void verifyTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        System.out.println("-actualTitle---"+actualTitle);
        System.out.println("---expectedTitle-"+expectedTitle);
        assert actualTitle.equals(expectedTitle) : "Actual title: " + actualTitle;
    }

    @Then("close the browser")
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
