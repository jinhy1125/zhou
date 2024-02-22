package com.jinhy.zhou.bean;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * Person
 * @description
 * @author jinhy
 * @date 2023/1/12 16:00
 * @version 1.0
 */
@Data
public class Person {

    private String id;

    private String name;

    private Integer gender;

    private LocalDateTime birthday;

    private Integer relationship;

    private String address;

    private String phone;
}