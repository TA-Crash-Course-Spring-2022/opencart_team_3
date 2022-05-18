package com.opencart.enums;

public enum Url {

    BASIC_URL("http://localhost/opencart/upload/index.php"),
    ADMIN_URL("http://localhost/opencart/upload/admin/");

    private final String urlValue;

    Url(String urlValue){
        this.urlValue = urlValue;
    }

    public String getUrlValue(){
        return urlValue;
    }

}
