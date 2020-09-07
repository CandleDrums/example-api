/**
 * @Project example-server-api
 * @Package com.cds.api.example.model
 * @Class TableNameVO.java
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
@NumGenerateRule(prefixCode = "1001", ruleCode = 7)
public class TableNameVO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String num;
    private Integer version;
    private Date createDate;
    private Date updateDate;
}
