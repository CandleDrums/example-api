/**
 * @Project example-server-api
 * @Package com.cds.api.example.model
 * @Class TableVO.java
 * @Date [date]
 * @Copyright (c) 2019 CandleDrums.com All Right Reserved.
 */
package com.cds.api.example.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * @Description [name]VO
 * @Notes 未填写备注
 * @author liming
 * @Date [date]
 */
@Data
public class TableVO implements Serializable {
    private static final long serialVersionUID = 1L;

    // num
    private String num;
    // 创建时间
    private Date createDate;
    // 更新时间
    private Date updateDate;

}
