package com.opencart.navigation;

import org.openqa.selenium.WebDriver;
import com.opencart.driver.Driver;

public class Navigation {

    private WebDriver driver;

    public Navigation(){
        driver = Driver.DRIVERS.get();
    }

    public void navigateToUrl(String url){
        driver.get(url);
        driver.manage().window().maximize();
    }

}
