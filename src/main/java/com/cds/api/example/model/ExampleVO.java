/**
 * @Project example-server-api
 * @Package com.cd.api.example.model
 * @Class ExampleVO.java
 * @Date Dec 21, 2019 5:01:07 PM
 * @Copyright (c) 2019 CandleDrums.com All Right Reserved.
 */
package com.cds.api.example.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import com.cds.api.example.status.ExampleStatus;
import com.cds.api.example.type.ExampleType;

import lombok.Data;

/**
 * @Description TODO 填写描述信息
 * @Notes 未填写备注
 * @author liming
 * @Date Dec 21, 2019 5:01:07 PM
 */
@Data
public class ExampleVO implements Serializable {
    private static final long serialVersionUID = 1L;

    // 账户Num
    private String num;
    // 账户类型
    @NotNull(message = "账户类型不能为空")
    private ExampleType type;
    // 账户状态
    private ExampleStatus status;
    // 创建时间
    private Date createDate;
    // 更新时间
    private Date updateDate;

}
