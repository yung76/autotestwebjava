package com.sample.steps;

import com.sample.pages.MainPage;
import com.sample.pages.WebDriverManager;
import com.sample.utils.RandomGenerator;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
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
    RandomGenerator randomGenerator = new RandomGenerator();

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
        mainPage.clickFirstProductList();
    }

    @And("search a product {string}")
    public void searchProduct(String product) throws InterruptedException {

       mainPage.setInputSearch(product);
    }

    @And("write username {string}")
    public void writeUsername(String username) throws InterruptedException {
       mainPage.setInputUsername(username);
    }

    @And("write password {string}")
    public void writePassword(String password) throws InterruptedException {
        mainPage.setInputPassword(password);
    }

    @And("go to PIM section")
    public void goToPIMSection() throws InterruptedException {
        mainPage.clickBtnPIM();
    }

    @And("go to emergency contact")
    public void goToEmergencyContactSection() throws InterruptedException {
        mainPage.booleanBtnMenuPersonalDetails();
        mainPage.clickBtnEmergencyContact();
    }

    @And("go to salary")
    public void goToSalary() throws InterruptedException {
        mainPage.booleanBtnMenuPersonalDetails();
        mainPage.clickBtnSalary();
    }

    @And("add new employee")
    public void addNewEmployee() throws InterruptedException {
        mainPage.clickBtnAddEmployee();
        mainPage.setInputFirstName(randomGenerator.generateRandomText(4));
        mainPage.setInputMiddleName(randomGenerator.generateRandomText(4));
        mainPage.setInputLastName(randomGenerator.generateRandomText(4));
        mainPage.clickBtnSaveEmployee();

    }

    @And("add new emergency contact")
    public void addNewEmergencyContact() throws InterruptedException {
        mainPage.clickBtnAddEmergencyContact();
        mainPage.setInputNameEmergencyContact(randomGenerator.generateRandomText(4));
        mainPage.setInputRelationshipEmergencyContact(randomGenerator.generateRandomText(4));
        mainPage.setInputPhoneEmergencyContact(randomGenerator.generateRandomNumber(8));
        mainPage.clickBtnSaveEmployee();
    }

    @Then("add salary component")
    public void addSalary() throws InterruptedException {
        mainPage.clickBtnAddEmployee();
        mainPage.setInputSalaryComponent(randomGenerator.generateRandomNumber(6));
        // combox box
        mainPage.clickBtnSaveEmployee();
    }

    @Then("click in login button")
    public void loginButton() throws InterruptedException {
       mainPage.hacerLogin();
    }

    @Then("validated entry home page")
    public void validatedEntryHomePage() throws InterruptedException {
       Assert.assertTrue("No se mostrado el home",mainPage.booleanBtnDashboard());
    }

    @Then("employee add success")
    public void employeeAddSuccess() throws InterruptedException {
       Assert.assertTrue("No se mostrado el home",mainPage.booleanBtnDashboard());
    }

    @After
    public void closeApp() {
        logger.info("Se cierra la Session");
        mainPage.quitDriver();
    }

}
