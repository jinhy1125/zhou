package com.jinhy.zhou.enums;

/**
 * GenderEnum
 * @description
 * @author jinhy
 * @date 2023/1/12 16:31
 * @version 1.0
 */
public enum GenderEnum {

    //Enum for Gender
    MALE("MALE"),
    FEMALE("FEMALE");

    private final String gender;

    GenderEnum(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}