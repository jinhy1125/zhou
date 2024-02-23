package com.jinhy.zhou.controller;

import com.jinhy.zhou.bean.Item;
import com.jinhy.zhou.service.ItemService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ItemController
 *
 * @author jinhy
 * @version 0.1
 * @description
 * @date 2024/2/23 17:15
 */
@RestController
@RequestMapping("item")
public class ItemController {

    @Resource
    private ItemService itemService;

    @PostMapping
    public String saveOrUpdateItem(@RequestBody Item item) {
        itemService.saveOrUpdateItem(item);
        return "success";
    }
}