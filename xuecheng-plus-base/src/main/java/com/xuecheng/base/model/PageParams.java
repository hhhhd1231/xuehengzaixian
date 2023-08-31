package com.xuecheng.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author 224TTx
 * @description
 * @create 2023/8/31 22:27:41
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PageParams {
    //当前页码
    private Long pageNo = 1L;

    //每页记录数默认值
    private Long pageSize =10L;

}
