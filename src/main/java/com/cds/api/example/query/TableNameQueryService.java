/**
 * @Project example-api
 * @Package com.cds.api.example.query
 * @Class TableNameQueryService.java
 * @Date [date]
 * @Copyright (c) 2019 CandleDrumS.com All Right Reserved
 */
package com.cds.api.example.query;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.cds.api.example.constant.APIConstants;
import com.cds.api.example.model.TableNameVO;
import com.cds.base.common.page.Page;
import com.cds.base.common.page.PageResult;
import com.cds.base.common.result.ResponseResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @Description [name]查询服务
 * @Notes 未填写备注
 * @author [author]
 * @Date [date]
 */
@Api(value = "[name]查询服务", tags = {"[name]查询"})
@FeignClient(name = APIConstants.APP_NAME)
public interface TableNameQueryService {
    // uri前缀
    final static String BASE_PREFIX = "/query";
    // 前缀
    static final String PREFIX = BASE_PREFIX + "/TableNameQueryService";

    @ApiOperation(value = "是否存在")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "调用成功"), @ApiResponse(code = 201, message = "收到请求"),
        @ApiResponse(code = 401, message = "权限错误"), @ApiResponse(code = 403, message = "禁止访问"),
        @ApiResponse(code = 404, message = "地址错误"), @ApiResponse(code = 500, message = "系统错误")})
    @PostMapping(PREFIX + "/contains")
    ResponseResult<Boolean> contains(@RequestBody @NotNull TableNameVO tableName);

    @ApiOperation(value = "详情")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "调用成功"), @ApiResponse(code = 201, message = "收到请求"),
        @ApiResponse(code = 401, message = "权限错误"), @ApiResponse(code = 403, message = "禁止访问"),
        @ApiResponse(code = 404, message = "地址错误"), @ApiResponse(code = 500, message = "系统错误")})
    @PostMapping(PREFIX + "/detail")
    ResponseResult<TableNameVO> detail(@RequestParam(value = "num", required = true) String num);

    @ApiOperation(value = "指定条件查询")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "调用成功"), @ApiResponse(code = 201, message = "收到请求"),
        @ApiResponse(code = 401, message = "权限错误"), @ApiResponse(code = 403, message = "禁止访问"),
        @ApiResponse(code = 404, message = "地址错误"), @ApiResponse(code = 500, message = "系统错误")})
    @PostMapping(PREFIX + "/queryAll")
    ResponseResult<List<TableNameVO>> queryAll(@RequestBody @NotNull TableNameVO tableName);

    @ApiOperation(value = "分页查询")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "调用成功"), @ApiResponse(code = 201, message = "收到请求"),
        @ApiResponse(code = 401, message = "权限错误"), @ApiResponse(code = 403, message = "禁止访问"),
        @ApiResponse(code = 404, message = "地址错误"), @ApiResponse(code = 500, message = "系统错误")})
    @PostMapping(PREFIX + "/queryPagingList")
    ResponseResult<PageResult<TableNameVO>> queryPagingList(@RequestBody @NotNull Page<TableNameVO> page);

}
