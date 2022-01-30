package ru.netology;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor

public class UserInfo {

    private String city;
    private String name;
    private String phone;

    public UserInfo(String city, String name, String phone) {
        this.city = city;
        this.name = name;
        this.phone = phone;
    }

}