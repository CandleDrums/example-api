/**
 * @Project example-api
 * @Package package com.cds.api.example.manage
 * @Class TableNameManageService.java
 * @Date [date]
 * @Copyright (c) 2019 CandleDrumS.com All Right Reserved
 */
package com.cds.api.example.manage;

import javax.validation.constraints.NotNull;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.cds.api.example.constant.APIConstants;
import com.cds.api.example.model.TableNameVO;
import com.cds.base.api.service.GeneralManageService;
import com.cds.base.common.result.ResponseResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @Description [name]管理服务
 * @Notes 未填写备注
 * @author [author]
 * @Date [date]
 */
@Api(value = "[name]管理服务", tags = {"[name]管理"})
@FeignClient(name = APIConstants.APP_NAME)
public interface TableNameManageService extends GeneralManageService<TableNameVO> {
    // 前缀
    static final String PREFIX = BASE_PREFIX + "/TableNameManageService";

    @Override
    @ApiOperation(value = "删除")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "调用成功"), @ApiResponse(code = 201, message = "收到请求"),
        @ApiResponse(code = 401, message = "权限错误"), @ApiResponse(code = 403, message = "禁止访问"),
        @ApiResponse(code = 404, message = "地址错误"), @ApiResponse(code = 500, message = "系统错误")})
    @PostMapping(PREFIX + "/delete")
    ResponseResult<Boolean> delete(@RequestParam(value = "num", required = true) @NotNull String num);

    @Override
    @ApiOperation(value = "添加")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "调用成功"), @ApiResponse(code = 201, message = "收到请求"),
        @ApiResponse(code = 401, message = "权限错误"), @ApiResponse(code = 403, message = "禁止访问"),
        @ApiResponse(code = 404, message = "地址错误"), @ApiResponse(code = 500, message = "系统错误")})
    @PostMapping(PREFIX + "/add")
    ResponseResult<TableNameVO> add(@RequestBody @NotNull TableNameVO tableName);

    @Override
    @ApiOperation(value = "修改")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "调用成功"), @ApiResponse(code = 201, message = "收到请求"),
        @ApiResponse(code = 401, message = "权限错误"), @ApiResponse(code = 403, message = "禁止访问"),
        @ApiResponse(code = 404, message = "地址错误"), @ApiResponse(code = 500, message = "系统错误")})
    @PostMapping(PREFIX + "/modify")
    ResponseResult<TableNameVO> modify(@RequestBody @NotNull TableNameVO tableName);

}
