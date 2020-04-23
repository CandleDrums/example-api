/**
 * @Project example-api
 * @Package com.cds.api.example.status
 * @Class ExampleStatus.java
 * @Date [date]
 * @Copyright (c) 2019 CandleDrums.com All Right Reserved.
 */
package com.cds.api.example.status;

/**
 * @Description [name]示例状态
 * @Notes 未填写备注
 * @author [author]
 * @Date [date]
 */
public enum ExampleStatus {
    EXAMPLE_STATUS("EXAMPLE_STATUS", "示例状态");

    // 值
    private final String value;
    // 义
    private String desc;

    private ExampleStatus(String value, String desc) {
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
