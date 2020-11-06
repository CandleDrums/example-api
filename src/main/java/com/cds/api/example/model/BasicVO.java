/**
 * @Project example-api
 * @Package com.cds.api.example.model
 * @Class BasicVO.java
 * @Date Nov 5, 2020 6:38:14 PM
 * @Copyright (c) 2020 CandleDrums.com All Right Reserved.
 */
package com.cds.api.example.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * @Description TODO 填写描述信息
 * @Notes 未填写备注
 * @author liming
 * @Date Nov 5, 2020 6:38:14 PM
 */
@Data
public class BasicVO {
    private Integer id;

    /**
     * 编号
     */
    @NotNull
    private String modelNameNum;

    /**
     * 创建时间
     */
    private Date createDate;
}
