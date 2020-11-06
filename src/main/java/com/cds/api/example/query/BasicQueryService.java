/**
 * @Project example-api
 * @Package com.cds.api.example.query
 * @Class BasicQueryService.java
 * @Date Nov 5, 2020 6:45:15 PM
 * @Copyright (c) 2020 CandleDrums.com All Right Reserved.
 */
package com.cds.api.example.query;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cds.api.example.constant.APIConstants;
import com.cds.api.example.model.BasicVO;
import com.cds.base.api.service.BaseQueryService;
import com.cds.base.common.page.Page;
import com.cds.base.common.page.PageResult;
import com.cds.base.common.result.ResponseResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @Description TODO 填写描述信息
 * @Notes 未填写备注
 * @author liming
 * @Date Nov 5, 2020 6:45:15 PM
 */
@Api(value = "[name]查询服务", tags = {"[name]查询"})
@FeignClient(name = APIConstants.APP_NAME)
public interface BasicQueryService extends BaseQueryService<BasicVO> {

    // 前缀
    static String PREFIX = BASE_PREFIX + "/BasicQueryService";

    @Override
    @ApiOperation(value = "详情")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "调用成功"), @ApiResponse(code = 201, message = "收到请求"),
        @ApiResponse(code = 401, message = "权限错误"), @ApiResponse(code = 403, message = "禁止访问"),
        @ApiResponse(code = 404, message = "地址错误"), @ApiResponse(code = 500, message = "系统错误")})
    @PostMapping(PREFIX + "/detail/{id}")
    ResponseResult<BasicVO> detail(@PathVariable Serializable id);

    @Override
    @ApiOperation(value = "指定条件查询")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "调用成功"), @ApiResponse(code = 201, message = "收到请求"),
        @ApiResponse(code = 401, message = "权限错误"), @ApiResponse(code = 403, message = "禁止访问"),
        @ApiResponse(code = 404, message = "地址错误"), @ApiResponse(code = 500, message = "系统错误")})
    @PostMapping(PREFIX + "/queryAll")
    ResponseResult<List<BasicVO>> queryAll(@RequestBody BasicVO tableName);

    @Override
    @ApiOperation(value = "分页查询")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "调用成功"), @ApiResponse(code = 201, message = "收到请求"),
        @ApiResponse(code = 401, message = "权限错误"), @ApiResponse(code = 403, message = "禁止访问"),
        @ApiResponse(code = 404, message = "地址错误"), @ApiResponse(code = 500, message = "系统错误")})
    @PostMapping(PREFIX + "/queryPagingList")
    ResponseResult<PageResult<BasicVO>> queryPagingList(@RequestBody @NotNull Page<BasicVO> page);

}
