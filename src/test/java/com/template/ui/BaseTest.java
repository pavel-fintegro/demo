package com.template.ui;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

import static com.template.ui.helpers.properties.UrlLinksProp.MAIN_URL;

public class BaseTest {

    public String baseUrl = MAIN_URL;

    @BeforeClass
    public void preClass(){
        Configuration.browser =  "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout =  5000;
        Configuration.reportsFolder = "target/test-result/reports";

    }
}

