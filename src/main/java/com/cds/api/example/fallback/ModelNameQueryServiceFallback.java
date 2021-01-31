/**
 * @Project example-api
 * @Package com.cds.api.example.fallback
 * @Class FallBackFactory.java
 * @Date 2021年1月24日 下午2:06:15
 * @Copyright (c) 2021 CandleDrums.com All Right Reserved.
 */
package com.cds.api.example.fallback;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import com.cds.api.example.model.ModelNameVO;
import com.cds.api.example.query.ModelNameQueryService;
import com.cds.base.api.AbstractFallbackFactory;
import com.cds.base.common.page.Page;
import com.cds.base.common.result.ResponseResult;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description [name]查询服务失败处理
 * @Notes 未填写备注
 * @author liming
 * @Date 2021年1月24日 下午2:06:15
 */
@Component
@Slf4j
public class ModelNameQueryServiceFallback extends AbstractFallbackFactory
    implements FallbackFactory<ModelNameQueryService> {

    @Override
    public ModelNameQueryService create(Throwable cause) {
        return new ModelNameQueryService() {

            @Override
            public ResponseResult<ModelNameVO> queryUnique(@NotNull ModelNameVO params) {
                return returnFail();
            }

            @Override
            public ResponseResult<Page<ModelNameVO>> queryPage(@NotNull Page<ModelNameVO> pageParams) {
                return returnFail();
            }

            @Override
            public ResponseResult<List<ModelNameVO>> query(ModelNameVO params) {
                return returnFail();
            }

            @Override
            public ResponseResult<ModelNameVO> detail(@NotNull Serializable pk) {
                return returnFail();
            }
        };
    }

}
