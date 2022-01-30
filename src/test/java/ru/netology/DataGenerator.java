package ru.netology;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class DataGenerator {

    public DataGenerator() {
    }

    public static UserInfo getUserInfo() {
        Faker faker = new Faker(new Locale("ru"));
        return new UserInfo(faker.options().option("Москва", "Санкт-Петербург", "Ульяновск"), faker.name().lastName() + " " + faker.name().firstName(), faker.phoneNumber().phoneNumber());
    }

    public static String generateDate(int count) {
        String date;
        LocalDate localDate = LocalDate.now().plusDays(count);
        date = DateTimeFormatter.ofPattern("dd.MM.yyyy").format(localDate);
        return date;
    }


}