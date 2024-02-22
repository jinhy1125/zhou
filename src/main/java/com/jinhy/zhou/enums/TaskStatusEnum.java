/**
 * @projectName zhou
 * @package com.jinhy.zhou.enums
 * @className com.jinhy.zhou.enums.TaskStatusEnum
 * @copyright Copyright 2023 Thunisoft, Inc All rights reserved.
 */
package com.jinhy.zhou.enums;

import lombok.Getter;

/**
 * TaskStatusEnum
 * @description
 * @author jinhy
 * @date 2023/1/12 14:53
 * @version 1.0
 */
@Getter
public enum TaskStatusEnum {

    CREATE(1, "新建"),

    DOING(2, "进行中"),

    UNCOMPLETED(3, "未完成"),

    COMPLETED(4, "已完成");

    private Integer id;

    private String description;

    TaskStatusEnum(Integer id, String description) {
        this.id = id;
        this.description = description;
    }
}