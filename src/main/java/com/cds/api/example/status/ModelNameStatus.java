/**
 * @Project example-api
 * @Package com.cds.api.example.status
 * @Class ModelNameStatus.java
 * @Date [date]
 * @Copyright [copyright]
 */
package com.cds.api.example.status;

/**
 * @Description [name]示例状态
 * @Notes 未填写备注
 * @author [author]
 * @Date [date]
 */
public enum ModelNameStatus {
    STATUS("STATUS", "示例状态");

    // 值
    private final String value;
    // 义
    private String desc;

    private ModelNameStatus(String value, String desc) {
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
