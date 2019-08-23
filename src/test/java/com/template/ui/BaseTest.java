package com.template.ui;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    String baseUrl = "";

    @BeforeClass
    public void preClass(){
        Configuration.browser =  "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout =  5000;
        Configuration.reportsFolder = "target/test-result/reports";

    }
}

