/**
 * @Project example-api
 * @Package com.cds.api.example.type
 * @Class ModelNameType.java
 * @Date [date]
 * @Copyright [copyright]
 */
package com.cds.api.example.type;

/**
 * @Description [name]示例类型
 * @Notes 未填写备注
 * @author [author]
 * @Date [date]
 */
public enum ModelNameType {
    TYPE("TYPE", "示例类型");

    // 值
    private final String value;
    // 义
    private String desc;

    private ModelNameType(String value, String desc) {
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
