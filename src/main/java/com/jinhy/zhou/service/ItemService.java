
package com.jinhy.zhou.service;

import com.jinhy.zhou.bean.Item;
import com.jinhy.zhou.repository.ItemRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ItemService
 * @description
 * @author jinhy
 * @date 2024/2/23 17:13
 * @version 0.1
 */
@Service
public class ItemService {

    @Resource
    private ItemRepository itemRepository;

    public void saveOrUpdateItem(Item item) {
        itemRepository.save(item);
    }
}