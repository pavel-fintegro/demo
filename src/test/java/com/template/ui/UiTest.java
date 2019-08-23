package com.template.ui;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class UiTest extends BaseTest {

    @Test
    public void testOpenGoogle(){
        open(baseUrl);
    }

}
