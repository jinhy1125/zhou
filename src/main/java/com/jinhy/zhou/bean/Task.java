/**
 * @projectName zhou
 * @package com.jinhy.zhou.bean
 * @className com.jinhy.zhou.bean.Task
 * @copyright Copyright 2023 Thunisoft, Inc All rights reserved.
 */
package com.jinhy.zhou.bean;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

/**
 * Task
 * @description
 * @author jinhy
 * @date 2023/1/12 14:34
 * @version 1.0
 */
@Data
public class Task {

    private String id;

    private String name;

    private String description;

    private LocalDateTime createTime;

    private LocalDateTime endTime;

    private LocalDateTime deadline;

    private Long timeInvested;

    private Long estimatedTime;

    private Integer status;

    private List<String> tagIds;
}