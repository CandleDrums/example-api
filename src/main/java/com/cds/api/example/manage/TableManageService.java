/**
 * @Project example-api
 * @Package package com.cds.api.example.manage
 * @Class TableManageService.java
 * @Date [date]
 * @Copyright (c) 2019 CandleDrums.com All Right Reserved.
 */
package com.cds.api.example.manage;

import javax.validation.constraints.NotNull;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.cds.api.example.constant.APIConstants;
import com.cds.api.example.model.TableVO;
import com.cds.base.api.service.GeneralManageService;
import com.cds.base.common.result.ResponseResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Description [name]管理服务
 * @Notes 未填写备注
 * @author [author]
 * @Date [date]
 */
@Api(value = "[name]管理服务", tags = {"[name]管理"})
@FeignClient(name = APIConstants.APP_NAME)
public interface TableManageService extends GeneralManageService<TableVO> {
    // 前缀
    static final String PREFIX = BASE_PREFIX + "/TableManageService";

    @Override
    @ApiOperation(value = "删除")
    @PostMapping(PREFIX + "/delete")
    ResponseResult<Boolean> delete(@RequestParam(value = "num", required = true) @NotNull String num);

    @Override
    @ApiOperation(value = "添加")
    @PostMapping(PREFIX + "/add")
    ResponseResult<TableVO> add(@RequestBody @NotNull TableVO example);

    @Override
    @ApiOperation(value = "修改")
    @PostMapping(PREFIX + "/modify")
    ResponseResult<TableVO> modify(@RequestBody @NotNull TableVO example);

}
