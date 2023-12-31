package com.sample.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MainPage extends WebDriverManager{

    private static final Logger logger =  LogManager.getLogger(MainPage.class);
    // Constructor
    public MainPage() {
        PageFactory.initElements( getDriver(), this);
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

    @FindBy(xpath = "//input[@name=\"username\"]")
    WebElement inputUsername;

    @FindBy(xpath = "//input[@name=\"password\"]")
    WebElement inputPassword;

    @FindBy(xpath = "//button[contains(@class,'login-button')]")
    WebElement btnLogin;

    @FindBy(xpath = "//span[text()='PIM']/..")
    WebElement btnPIM;

    @FindBy(xpath = "//button[text()=\" Add \"]")
    WebElement btnAddNewEmployee;

    @FindBy(xpath = "//input[@name=\"firstName\"]")
    WebElement inputFirstName;

    @FindBy(xpath = "//input[@name=\"middleName\"]")
    WebElement inputMiddleName;

    @FindBy(xpath = "//input[@name=\"lastName\"]")
    WebElement inputLastName;

    @FindBy(xpath = "//label[text()=\"Name\"]/../../div[2]/input")
    WebElement inputNameEmergencyContact;

    @FindBy(xpath = "//label[text()=\"Relationship\"]/../../div[2]/input")
    WebElement inputRelationshipEmergencyContact;

    @FindBy(xpath = "//label[text()=\"Home Telephone\"]/../../div[2]/input")
    WebElement inputPhoneEmergencyContact;

    @FindBy(xpath = "//label[text()=\"Salary Component\"]/../../div[2]/input")
    WebElement inputSalaryComponent;

    @FindBy(xpath = "//label[text()=\"pim.amount\"]/../../div[2]/input")
    WebElement inputPimAmount;

    @FindBy(xpath = "//label[text()=\"Currency\"]/../../div[2]/div")
    WebElement listBoxCurrency;

    @FindBy(xpath = "//button[text()=\" Save \"]")
    WebElement btnSaveEmployee;

    @FindBy(xpath = "//a[text()=\"Personal Details\"]")
    WebElement btnMenuPersonalDetails;

    @FindBy(xpath = "//a[text()=\"Emergency Contacts\"]/..")
    WebElement btnMenuEmergencyContact;

    @FindBy(xpath = "//a[text()=\"Salary\"]/..")
    WebElement btnMenuSalary;

    @FindBy(xpath = "(//button[text()=\" Add \"])[1]")
    WebElement btnAddEmergencyContact;

    @FindBy(xpath = "(//div[@class=\"oxd-table-card\"])[2]")
    WebElement lblFirstEmployeeList;

    @FindBy(id = "path0")
    WebElement btnDashboard;

    // Métodos para interactuar con los elementos
    public void inputUser() throws InterruptedException {
        logger.info("Accediendo a la pagina");
        waitForElementToBeVisible(imgLogo);
        imgLogo.isDisplayed();
        logger.info("Funco");
    }

    public void setInputSearch(String search) throws InterruptedException {
        logger.info("Buscando btnSearch");
        waitForElementToBeVisible(btnSearch);
        btnSearch.click();
        logger.info("Buscando inputSearch");
        waitForElementToBeVisible(inputSearch);

        inputSearch.sendKeys(search);
        logger.info("Presione enter");
        inputSearch.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }

    public void setInputUsername(String username) throws InterruptedException {
        logger.info("Buscando inputUsername");
        waitForElementToBeVisible(inputUsername);
        logger.info("Ingresando el siguiente usuario " + username);
        inputUsername.sendKeys(username);
        Thread.sleep(2000);
    }

    public void setInputPassword(String password) throws InterruptedException {
        logger.info("Buscando inputPassword");
        waitForElementToBeVisible(inputPassword);
        logger.info("Ingresando el siguiente password " + password);
        inputPassword.sendKeys(password);
        Thread.sleep(2000);
    }

    public void setInputFirstName(String firstName) throws InterruptedException {
        logger.info("Buscando firstName");
        waitForElementToBeVisible(inputFirstName);
        logger.info("Ingresando el siguiente firstName " + firstName);
        inputFirstName.sendKeys(firstName);
    }

    public void setInputSalaryComponent(String salary) throws InterruptedException {
        logger.info("Buscando inputSalaryComponent");
        waitForElementToBeVisible(inputSalaryComponent);
        logger.info("Ingresando el siguiente salary " + salary);
        inputSalaryComponent.sendKeys(salary);
    }

    public void setInputNameEmergencyContact(String firstName) throws InterruptedException {
        logger.info("Buscando inputNameEmergencyContact");
        waitForElementToBeVisible(inputNameEmergencyContact);
        logger.info("Ingresando el siguiente firstName " + firstName);
        inputNameEmergencyContact.sendKeys(firstName);
    }

    public void setInputRelationshipEmergencyContact(String firstName) throws InterruptedException {
        logger.info("Buscando inputRelationshipEmergencyContact");
        waitForElementToBeVisible(inputRelationshipEmergencyContact);
        logger.info("Ingresando el siguiente firstName " + firstName);
        inputRelationshipEmergencyContact.sendKeys(firstName);
    }

    public void setInputPhoneEmergencyContact(String phone) throws InterruptedException {
        logger.info("Buscando inputPhoneEmergencyContact");
        waitForElementToBeVisible(inputPhoneEmergencyContact);
        logger.info("Ingresando el siguiente telefono " + phone);
        inputPhoneEmergencyContact.sendKeys(phone);
    }

    public void setInputLastName(String lastName) throws InterruptedException {
        logger.info("Buscando inputLastName");
        waitForElementToBeVisible(inputLastName);
        logger.info("Ingresando el siguiente inputLastName " + lastName);
        inputLastName.sendKeys(lastName);
        Thread.sleep(5000);
    }

    public void setInputMiddleName(String middleName) throws InterruptedException {
        logger.info("Buscando middleName");
        waitForElementToBeVisible(inputMiddleName);
        logger.info("Ingresando el siguiente middleName " + middleName);
        inputMiddleName.sendKeys(middleName);
    }

    public void selectListBoxCurrency(String currency) throws InterruptedException {
        logger.info("Buscando listBoxCurrency");
        waitForElementToBeVisible(listBoxCurrency);
        Select comboBox = new Select(listBoxCurrency);
        logger.info("Seleccionando Chilean peso");
        comboBox.selectByValue("Chilean peso");
    }

    public void clickFirstProductList() throws InterruptedException {
        logger.info("Buscando firstProductList");
        waitForElementToBeVisible(firstProductList);
        logger.info("Click firstProductList");
        firstProductList.click();
        Thread.sleep(5000);
    }

    public boolean booleanBtnDashboard() throws InterruptedException {
        logger.info("Buscando btnDashboard");
        waitForElementToBeVisible(btnDashboard);
        Thread.sleep(2000);
        return btnDashboard.isDisplayed();
    }

    public boolean booleanBtnMenuPersonalDetails() throws InterruptedException {
        logger.info("Buscando btnMenuPersonalDetails");
        waitForElementToBeVisible(btnMenuPersonalDetails);
        Thread.sleep(2000);
        return btnMenuPersonalDetails.isDisplayed();
    }

    public void hacerLogin() throws InterruptedException {
        logger.info("Click en btnLogin");
        btnLogin.click();
        Thread.sleep(2000);
    }

    public void clickBtnPIM() throws InterruptedException {
        waitForElementToBeVisible(btnPIM);
        logger.info("Click en btnPIM");
        btnPIM.click();
    }

    public void clickBtnAddEmployee() throws InterruptedException {
        waitForElementToBeVisible(btnAddNewEmployee);
        logger.info("Click en btnAddNewEmployee");
        btnAddNewEmployee.click();
    }

    public void clickBtnSaveEmployee() throws InterruptedException {
        waitForElementToBeVisible(btnSaveEmployee);
        logger.info("Click en btnSaveEmployee");
        btnSaveEmployee.click();
        Thread.sleep(5000);
    }

    public void clickBtnEmergencyContact() throws InterruptedException {
        waitForElementToBeVisible(btnMenuEmergencyContact);
        logger.info("Click en btnMenuEmergencyContact");
        btnMenuEmergencyContact.click();
        Thread.sleep(2000);
    }

    public void clickBtnSalary() throws InterruptedException {
        waitForElementToBeVisible(btnMenuSalary);
        logger.info("Click en btnMenuSalary");
        btnMenuSalary.click();
        Thread.sleep(2000);
    }

    public void clickBtnAddEmergencyContact() throws InterruptedException {
        waitForElementToBeVisible(btnAddEmergencyContact);
        logger.info("Click en btnAddEmergencyContact");
        btnAddEmergencyContact.click();
        Thread.sleep(2000);
    }

    public void clickBtnMenuPersonalDetails() throws InterruptedException {
        waitForElementToBeVisible(btnMenuPersonalDetails, 5);
        logger.info("Click en btnMenuPersonalDetails");
        btnMenuPersonalDetails.click();
        Thread.sleep(5000);
    }

    public void clickFirstListEmployee() throws InterruptedException {
        waitForElementToBeVisible(lblFirstEmployeeList, 5);
        logger.info("Click en lblFirstEmployeeList");
        lblFirstEmployeeList.click();
        Thread.sleep(5000);
    }

}
