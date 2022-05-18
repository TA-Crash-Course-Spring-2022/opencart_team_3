package com.opencart.pages.admin.LoginPage;

import com.opencart.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginAdminPage extends BasePage {

    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameInputField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInputField;

    @FindBy(xpath = "//*[text()=' Login']")
    private WebElement loginButton;

    @FindBy(xpath = "//span[@class='help-block']//*[text()='Forgotten Password']")
    private WebElement forgotPasswordLink;

    @FindBy(xpath = "//a//img[@title='OpenCart']")
    private WebElement opencartLogo;

    @FindBy(xpath = "//a[@href='http://www.opencart.com']")
    private WebElement opencartMainPageLink;

    @FindBy(xpath = "//div[@class='panel-heading']//h1")
    private WebElement loginPanelTitle;

    @FindBy(xpath = "//footer[@id='footer']")
    private  WebElement allRightReserved;

    public WebElement getLoginPanelTitle() {
        return loginPanelTitle;
    }

    public WebElement getAllRightReserved() {
        return allRightReserved;
    }

    public WebElement getUsernameInputField() {
        return usernameInputField;
    }

    public WebElement getPasswordInputField() {
        return passwordInputField;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getForgotPasswordLink() {
        return forgotPasswordLink;
    }

    public WebElement getOpencartLogo() {
        return opencartLogo;
    }

    public WebElement getOpencartMainPageLink() {
        return opencartMainPageLink;
    }

}
