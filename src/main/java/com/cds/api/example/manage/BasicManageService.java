/**
 * @Project example-api
 * @Package com.cds.api.example.manage
 * @Class BasicManageService.java
 * @Date Nov 5, 2020 6:46:37 PM
 * @Copyright (c) 2020 CandleDrums.com All Right Reserved.
 */
package com.cds.api.example.manage;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cds.api.example.constant.APIConstants;
import com.cds.api.example.model.BasicVO;
import com.cds.base.api.service.BaseManageService;
import com.cds.base.common.result.ResponseResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @Description TODO 填写描述信息
 * @Notes 未填写备注
 * @author liming
 * @Date Nov 5, 2020 6:46:37 PM
 */
@Api(value = "[name]管理服务", tags = {"[name]管理"})
@FeignClient(name = APIConstants.APP_NAME)
public interface BasicManageService extends BaseManageService<BasicVO> {
    // 前缀
    static final String PREFIX = BASE_PREFIX + "/BasicManageService";

    @Override
    @ApiOperation(value = "保存")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "调用成功"), @ApiResponse(code = 201, message = "收到请求"),
        @ApiResponse(code = 401, message = "权限错误"), @ApiResponse(code = 403, message = "禁止访问"),
        @ApiResponse(code = 404, message = "地址错误"), @ApiResponse(code = 500, message = "系统错误")})
    @PostMapping(PREFIX + "/save")
    ResponseResult<BasicVO> save(@RequestBody @NotNull BasicVO tableName);

    @Override
    @ApiOperation(value = "批量保存")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "调用成功"), @ApiResponse(code = 201, message = "收到请求"),
        @ApiResponse(code = 401, message = "权限错误"), @ApiResponse(code = 403, message = "禁止访问"),
        @ApiResponse(code = 404, message = "地址错误"), @ApiResponse(code = 500, message = "系统错误")})
    @PostMapping(PREFIX + "/saveAll")
    ResponseResult<Integer> saveAll(@RequestBody @NotNull List<BasicVO> valueList);

    @Override
    @ApiOperation(value = "修改")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "调用成功"), @ApiResponse(code = 201, message = "收到请求"),
        @ApiResponse(code = 401, message = "权限错误"), @ApiResponse(code = 403, message = "禁止访问"),
        @ApiResponse(code = 404, message = "地址错误"), @ApiResponse(code = 500, message = "系统错误")})
    @PostMapping(PREFIX + "/modify")
    ResponseResult<BasicVO> modify(@RequestBody @NotNull BasicVO tableName);

    @Override
    @ApiOperation(value = "删除")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "调用成功"), @ApiResponse(code = 201, message = "收到请求"),
        @ApiResponse(code = 401, message = "权限错误"), @ApiResponse(code = 403, message = "禁止访问"),
        @ApiResponse(code = 404, message = "地址错误"), @ApiResponse(code = 500, message = "系统错误")})
    @PostMapping(PREFIX + "/delete/{id}")
    ResponseResult<Boolean> delete(@PathVariable @NotNull Serializable id);

}
