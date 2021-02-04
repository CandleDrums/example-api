/**
 * @Project example-api
 * @Package com.cds.api.example.fallback
 * @Class ModelNameManageServiceFallback.java
 * @Date 2021年1月31日 下午6:39:05
 * @Copyright (c) 2021 CandleDrums.com All Right Reserved.
 */
package com.cds.api.example.fallback;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

import com.cds.api.example.manage.ModelNameManageService;
import com.cds.api.example.model.ModelNameVO;
import com.cds.base.api.AbstractFallbackFactory;
import com.cds.base.common.result.ResponseResult;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description [name]管理服务失败处理
 * @Notes 未填写备注
 * @author liming
 * @Date 2021年1月31日 下午6:39:05
 */
@Component
@Slf4j
public class ModelNameManageServiceFallback extends AbstractFallbackFactory
    implements FallbackFactory<ModelNameManageService> {

    @Override
    public ModelNameManageService create(Throwable cause) {
        return new ModelNameManageService() {

            @Override
            public ResponseResult<Integer> saveAll(@NotNull List<ModelNameVO> modelNameList) {
                return returnFail();
            }

            @Override
            public ResponseResult<ModelNameVO> save(@NotNull ModelNameVO modelName) {
                return returnFail();
            }

            @Override
            public ResponseResult<ModelNameVO> modify(@NotNull ModelNameVO modelName) {
                return returnFail();
            }

            @Override
            public ResponseResult<Boolean> delete(@NotNull Serializable pk) {
                return returnFail();
            }
        };
    }

}
