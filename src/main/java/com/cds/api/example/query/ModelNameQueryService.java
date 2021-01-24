/**
 * @Project example-api
 * @Package com.cds.api.example.query
 * @Class ModelNameQueryService.java
 * @Date [date]
 * @Copyright [copyright]
 */
package com.cds.api.example.query;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.cds.api.example.constant.APIConstants;
import com.cds.api.example.model.ModelNameVO;
import com.cds.base.api.fallback.DefaultFallbackFactory;
import com.cds.base.api.service.BaseQueryService;
import com.cds.base.common.page.Page;
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
@FeignClient(name = APIConstants.APP_NAME, fallbackFactory = DefaultFallbackFactory.class)
public interface ModelNameQueryService extends BaseQueryService<ModelNameVO> {

    // 前缀
    static String PREFIX = BASE_PREFIX + "/ModelNameQueryService";

    @Override
    @ApiOperation(value = "详情")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "调用成功"), @ApiResponse(code = 201, message = "收到请求"),
        @ApiResponse(code = 401, message = "权限错误"), @ApiResponse(code = 403, message = "禁止访问"),
        @ApiResponse(code = 404, message = "地址错误"), @ApiResponse(code = 500, message = "系统错误")})
    @PostMapping(PREFIX + "/detail")
    ResponseResult<ModelNameVO> detail(@RequestParam("pk") @NotNull Serializable pk);

    @Override
    @ApiOperation(value = "指定条件查询")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "调用成功"), @ApiResponse(code = 201, message = "收到请求"),
        @ApiResponse(code = 401, message = "权限错误"), @ApiResponse(code = 403, message = "禁止访问"),
        @ApiResponse(code = 404, message = "地址错误"), @ApiResponse(code = 500, message = "系统错误")})
    @PostMapping(PREFIX + "/query")
    ResponseResult<List<ModelNameVO>> query(@RequestBody ModelNameVO params);

    @Override
    @ApiOperation(value = "详情")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "调用成功"), @ApiResponse(code = 201, message = "收到请求"),
        @ApiResponse(code = 401, message = "权限错误"), @ApiResponse(code = 403, message = "禁止访问"),
        @ApiResponse(code = 404, message = "地址错误"), @ApiResponse(code = 500, message = "系统错误")})
    @PostMapping(PREFIX + "/query/unique")
    ResponseResult<ModelNameVO> queryUnique(@RequestBody @NotNull ModelNameVO params);

    @Override
    @ApiOperation(value = "分页查询")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "调用成功"), @ApiResponse(code = 201, message = "收到请求"),
        @ApiResponse(code = 401, message = "权限错误"), @ApiResponse(code = 403, message = "禁止访问"),
        @ApiResponse(code = 404, message = "地址错误"), @ApiResponse(code = 500, message = "系统错误")})
    @PostMapping(PREFIX + "/query/page")
    ResponseResult<Page<ModelNameVO>> queryPage(@RequestBody @NotNull Page<ModelNameVO> pageParams);

}
