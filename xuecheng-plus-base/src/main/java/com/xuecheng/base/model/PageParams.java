package com.xuecheng.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.java.Log;

/**
 * @description 分页查询分页参数模型
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PageParams {
    // 当前页
    @ApiModelProperty("页码")
    private Long pageNo = 1L;
    // 每页数据量
    @ApiModelProperty("数据量")
    private Long pageSize = 10L;

}
