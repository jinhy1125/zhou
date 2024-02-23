package com.jinhy.zhou.repository;

import com.jinhy.zhou.bean.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * ItemRepository
 * @description
 * @author jinhy
 * @date 2024/2/23 17:08
 * @version 0.1
 */
public interface ItemRepository extends MongoRepository<Item, String> {


}