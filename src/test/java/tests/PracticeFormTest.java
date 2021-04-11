package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;

public class PracticeFormTest extends TestBase {

    PracticeFormPage practiceFormPage = new PracticeFormPage();

    @Test
    void positiveFormTest() {
        practiceFormPage.openPage();
        practiceFormPage.fillData();
        practiceFormPage.checkData();
    }

    @Test
    void negativeFormTest() {
        practiceFormPage.openPage();
        practiceFormPage.fillData();
        practiceFormPage.checkData2();
    }

}