/**
 * @Project example-server-api
 * @Package com.cds.api.example.model
 * @Class ModelNameVO.java
 * @Date [date]
 * @Copyright [copyright]
 */
package com.cds.api.example.model;

import java.io.Serializable;
import java.util.Date;

import com.cds.base.common.annotaion.NumGenerateRule;

import lombok.Data;

/**
 * @Description [name]VO
 * @Notes 未填写备注
 * @author [author]
 * @Date [date]
 */
@Data
@NumGenerateRule(prefixCode = "自定义前缀", ruleCode = 7)
public class ModelNameVO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String num;
    private Integer version;
    // 动态添加相关属性
    private Date createDate;
    private Date updateDate;

}
