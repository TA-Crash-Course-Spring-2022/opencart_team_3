package com.opencart.pages;

import com.opencart.driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(){
        driver = Driver.DRIVERS.get();
        wait = new WebDriverWait(driver, 300);
        PageFactory.initElements(driver, this);
    }

    public void setValueForInputField(WebElement webElement, String string){
        webElement.clear();
        webElement.sendKeys(string);
    }

    public void checkIfExistString(WebElement webElement, String string){
        String currentTextOfElement = webElement.getText();
        Assert.assertEquals(currentTextOfElement, string);
    }
}
