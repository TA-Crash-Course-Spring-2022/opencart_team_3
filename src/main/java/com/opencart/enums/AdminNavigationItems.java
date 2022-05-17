package com.opencart.enums;

public enum AdminNavigationItems {
    DASHBOARD("dashboard"),
    CATALOG("catalog"),
    EXTENSIONS("extension"),
    DESIGN("design"),
    SALES("sale"),
    CUSTOMERS("customer"),
    MARKETING("marketing"),
    SYSTEM("system"),
    REPORTS("report");

    private String adminNavigationItem;

    AdminNavigationItems(String adminNavigationItem){ this.adminNavigationItem = adminNavigationItem; }

    public String getAdminNavigationItem() { return adminNavigationItem; }
}
