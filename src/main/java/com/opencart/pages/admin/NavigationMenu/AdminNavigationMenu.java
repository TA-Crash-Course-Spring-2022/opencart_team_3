package com.opencart.pages.admin.NavigationMenu;

import com.opencart.enums.AdminNavigationItems;
import com.opencart.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdminNavigationMenu extends BasePage {

    public WebElement getNavigationMenuItem(AdminNavigationItems adminNavigationItems){
        return driver.findElement(By.id("menu-" + adminNavigationItems.getAdminNavigationItem()));
    }

    //need some updates
    public WebElement getNavigationMenuItemFromDropDownFirstLevel(String dropDownItem){
        return driver.findElement(By.xpath("//ul[@id='menu']//ul[@class='collapse in']//*[text()='" + dropDownItem + "']"));
    }

    public WebElement getNavigationMenuItemFromDropDownSecondLevel(String dropDownItem){
        return driver.findElement(By.xpath("//ul[@id='menu']//ul[@class='collapse in']//ul[@class='collapse in']//*[contains(text(),'" + dropDownItem + "'" + ")]"));
    }
}
