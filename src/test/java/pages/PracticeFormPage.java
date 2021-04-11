package pages;

import base.Student;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormPage {

    Student student = new Student();

    @Step("Open students registration form")
    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
    }

    @Step("Fill registration form")
    public void fillData() {
        $("#firstName").setValue(student.firstName);
        $("#lastName").setValue(student.lastName);
        $("#userEmail").setValue(student.email);

        $("[for='gender-radio-1']").click(); // "Male"
        $("#userNumber").setValue(student.mobile);

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue("0");
        $(".react-datepicker__year-select").selectOptionByValue(student.yearOfBirth);
        $(".react-datepicker__day--001").click(); // 01

        $("#subjectsInput").setValue(student.subject).pressEnter();

        $("[for='hobbies-checkbox-3']").click(); // "Music"

        $("#uploadPicture").uploadFromClasspath(student.testFile);

        $("#currentAddress").setValue(student.address);

        $("#react-select-3-input").setValue(student.state).pressEnter();
        $("#react-select-4-input").setValue(student.city).pressEnter();

        $("#submit").click();

    }

    @Step("Check form submit")
    public void checkData() {
        $(".modal-content").shouldHave(text(student.firstName),
                text(student.lastName),
                text(student.email),
                text(student.gender),
                text(student.mobile),
                text("01 January," + student.yearOfBirth),
                text(student.subject),
                text(student.hobby),
                text(student.testFile),
                text(student.address),
                text(student.state + ' ' + student.city));

    }

    @Step("Check form submit")
    public void checkData2() {
        $(".modal-content").shouldHave(text(student.firstName),
                text(student.lastName),
                text(student.email),
                text(student.gender),
                text(student.mobile),
                text("02 January," + student.yearOfBirth),
                text(student.subject),
                text(student.hobby),
                text(student.testFile),
                text(student.address),
                text(student.state + ' ' + student.city));

    }
}
