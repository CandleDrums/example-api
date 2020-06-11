/**
 * @Project example-api
 * @Package com.cds.api.example.status
 * @Class TableNameStatus.java
 * @Date [date]
 * @Copyright (c) 2019 CandleDrumS.com All Right Reserved.
 */
package com.cds.api.example.status;

/**
 * @Description [name]示例状态
 * @Notes 未填写备注
 * @author [author]
 * @Date [date]
 */
public enum TableNameStatus {
    STATUS("STATUS", "示例状态");

    // 值
    private final String value;
    // 义
    private String desc;

    private TableNameStatus(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

}
