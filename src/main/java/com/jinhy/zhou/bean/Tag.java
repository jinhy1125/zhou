/**
 * @projectName zhou
 * @package com.jinhy.zhou.bean
 * @className com.jinhy.zhou.bean.Tag
 * @copyright Copyright 2023 Thunisoft, Inc All rights reserved.
 */
package com.jinhy.zhou.bean;

import lombok.Data;

/**
 * Tag
 * @description
 * @author jinhy
 * @date 2023/1/12 15:28
 * @version 1.0
 */
@Data
public class Tag {

    private String id;

    private String name;

    private String parentId;
}