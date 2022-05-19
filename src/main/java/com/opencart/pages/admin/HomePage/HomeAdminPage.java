package com.opencart.pages.admin.HomePage;

import com.opencart.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeAdminPage extends BasePage{

    @FindBy(xpath = "//button[@id='button-developer']")
    private WebElement developerButton;

    @FindBy(xpath = "//li//*[text()='Home']")
    private WebElement homeLink;

    @FindBy(xpath = "//li//*[text()='Dashboard']")
    private WebElement dashboardLink;

    @FindBy(xpath = "//div[@class='col-lg-3 col-md-3 col-sm-6']//*[text()='Total Orders ']/..")
    private WebElement totalOrdersComponent;

    @FindBy(xpath = "//div[@class='col-lg-3 col-md-3 col-sm-6']//*[text()='Total Sales ']/..")
    private WebElement totalSalesComponent;

    @FindBy(xpath = "//div[@class='col-lg-3 col-md-3 col-sm-6']//*[text()='Total Customers ']/..")
    private WebElement totalCustomersComponent;

    @FindBy(xpath = "//div[@class='col-lg-3 col-md-3 col-sm-6']//*[text()='People Online']/..")
    private WebElement peopleOnlineComponent;

    @FindBy(xpath = "//div[@class='col-lg-6 col-md-12 col-sm-12']//div[@id='vmap']")
    private WebElement worldMapComponent;

    @FindBy(xpath = "//div[@id='vmap']//div[@class='jqvmap-zoomin']")
    private WebElement zoomInButton;

    @FindBy(xpath = "//div[@id='vmap']//div[@class='jqvmap-zoomout']")
    private WebElement zoomOutButton;

    @FindBy(xpath = "//div[@id='chart-sale']")
    private WebElement salesAnalyticsChart;

    @FindBy(xpath = "//div[@class='pull-right']//a[@class='dropdown-toggle']//i[@class='fa fa-calendar']")
    private WebElement calendarButton;

    @FindBy(xpath = "//ul[@id='range']")
    private WebElement calendarDropDown;

    @FindBy(xpath = "//ul[@id='range']//li//a[@href='day']")
    private WebElement calendarDropDownTodayItem;

    @FindBy(xpath = "//ul[@id='range']//li//a[@href='week']")
    private WebElement calendarDropDownWeekItem;

    @FindBy(xpath = "//ul[@id='range']//li//a[@href='month']")
    private WebElement calendarDropDownMonthItem;

    @FindBy(xpath = "//ul[@id='range']//li//a[@href='year']")
    private WebElement calendarDropDownYearItem;

    @FindBy(xpath = "//div[@class='col-lg-4 col-md-12 col-sm-12']//li[@class='list-group-item text-center']")
    private WebElement recentActivityList;

    @FindBy(xpath = "//div[@class='col-lg-8 col-md-12 col-sm-12']//tbody")
    private WebElement latestOrdersList;

    public WebElement getCalendarDropDown() {
        return calendarDropDown;
    }

    public WebElement getCalendarDropDownTodayItem() {
        return calendarDropDownTodayItem;
    }

    public WebElement getCalendarDropDownWeekItem() {
        return calendarDropDownWeekItem;
    }

    public WebElement getCalendarDropDownMonthItem() {
        return calendarDropDownMonthItem;
    }

    public WebElement getCalendarDropDownYearItem() {
        return calendarDropDownYearItem;
    }

    public WebElement getDeveloperButton() {
        return developerButton;
    }

    public WebElement getHomeLink() {
        return homeLink;
    }

    public WebElement getDashboardLink() {
        return dashboardLink;
    }

    public WebElement getTotalOrdersComponent() {
        return totalOrdersComponent;
    }

    public WebElement getTotalSalesComponent() {
        return totalSalesComponent;
    }

    public WebElement getTotalCustomersComponent() {
        return totalCustomersComponent;
    }

    public WebElement getPeopleOnlineComponent() {
        return peopleOnlineComponent;
    }

    public WebElement getWorldMapComponent() {
        return worldMapComponent;
    }

    public WebElement getZoomInButton() {
        return zoomInButton;
    }

    public WebElement getZoomOutButton() {
        return zoomOutButton;
    }

    public WebElement getSalesAnalyticsChart() {
        return salesAnalyticsChart;
    }

    public WebElement getCalendarButton() {
        return calendarButton;
    }

    public WebElement getRecentActivityList() {
        return recentActivityList;
    }

    public WebElement getLatestOrdersList() {
        return latestOrdersList;
    }
}
