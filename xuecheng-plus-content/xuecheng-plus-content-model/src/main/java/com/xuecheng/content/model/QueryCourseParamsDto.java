package com.xuecheng.content.model;

import lombok.Data;
import lombok.ToString;

/**
 * @author 224TTx
 * @description
 * @create 2023/8/31 22:29:02
 */
@Data
@ToString
public class QueryCourseParamsDto {
    //审核状态
    private String auditStatus;
    //课程名称
    private String courseName;
    //发布状态
    private String publishStatus;
}
