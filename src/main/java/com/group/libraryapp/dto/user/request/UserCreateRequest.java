package com.group.libraryapp.dto.user.request;

public class UserCreateRequest {

    private String name;
    private Integer age; // int는 null  불가능, integer는 null 가능

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
