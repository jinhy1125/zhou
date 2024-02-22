package com.jinhy.zhou.bean;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * Item
 *
 * @author jinhy
 * @version 1.0
 * @description
 * @date 2023/1/13 11:15
 */
@Data
public class Item {

    private String id;

    private String name;

    private String price;

    private LocalDateTime purchaseDate;

    private LocalDateTime expirationDate;


}