/**
 * @Project example-server-api
 * @Package com.cds.api.example.model
 * @Class TableNameVO.java
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
public class TableNameVO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String num;
    private Date updateDate;
    private Date createDate;

}