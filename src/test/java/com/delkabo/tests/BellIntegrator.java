package com.delkabo.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.delkabo.components.BellIntegratorObject;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class BellIntegrator extends TestBase {

    BellIntegratorObject bellIntegratorObject = new BellIntegratorObject();

    @Test
    void BellIntegrator() {
        bellIntegratorObject.openPage()
                .searchVacancy("Bell Integrator QA Selenium")
                .clickSearched("Selenium")
                .shouldTitle("Bell Integrator");

    }
}
