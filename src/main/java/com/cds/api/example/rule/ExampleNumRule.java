/**
 * @Project example-api
 * @Package com.cds.api.example.rule
 * @Class ExampleNumRule.java
 * @Date Jun 8, 2020 4:19:53 PM
 * @Copyright (c) 2020 CandleDrumS.com All Right Reserved
 */
package com.cds.api.example.rule;

import com.cds.api.example.model.TableNameVO;
import com.cds.base.common.rule.NumRule;
import com.cds.base.common.rule.NumRuleMap;

/**
 * @Description Num规则
 * @Notes 未填写备注
 * @author [author]
 * @Date [date]
 */
public class ExampleNumRule {

    static {
        NumRuleMap.regRule(TableNameVO.class, new NumRule("1000", 7));
    }

}
