package com.jinhy.zhou.bean;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Item
 *
 * @author jinhy
 * @version 1.0
 * @description
 * @date 2023/1/13 11:15
 */
@Data
@Document("items")
public class Item {

    private String id;

    private String name;

    private Float price;

    private LocalDateTime purchaseDate;

    private LocalDateTime expirationDate;

    private List<String> tags;

    private String locationId;

}