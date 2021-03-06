package com.socks.pages.utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;

public class BaseUITest {

    @BeforeSuite
    public void setUp() {

        RestAssured.baseURI = "http://157.245.169.246";
        Configuration.baseUrl = "http://157.245.169.246";
        Configuration.timeout = 10000;
        Configuration.browser = "com.socks.pages.pages.SelenoidWebDriverProvider";
        Selenide.clearBrowserCookies();

    }

    protected <T> T at(Class<T> pageClass) {
        return Selenide.page(pageClass);
    }


}
