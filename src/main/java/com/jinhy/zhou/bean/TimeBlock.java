package com.jinhy.zhou.bean;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * TimeBlock
 * @description
 * @author jinhy
 * @date 2023/1/12 14:52
 * @version 1.0
 */
@Data
public class TimeBlock {

    private String id;

    private String taskId;

    private LocalDateTime startTime;

    private LocalDateTime endTime;
}