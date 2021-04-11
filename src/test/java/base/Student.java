package base;

import com.github.javafaker.Faker;

public class Student {

    Faker faker = new Faker();

    public String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            mobile = faker.number().digits(10),
            address = faker.address().streetAddress(),
            testFile = "tst.jpg",
            gender = "Male",
            monthOfBirth = "0",
            yearOfBirth = "1987",
            dayOfBirth = "1",
            subject = "Maths",
            hobby = "Music",
            state = "NCR",
            city = "Delhi";
}
