/**
 * @Project example-api
 * @Package com.cds.api.example.query
 * @Class ExampleQueryService.java
 * @Date [date]
 * @Copyright (c) 2019 CandleDrums.com All Right Reserved.
 */
package com.cds.api.example.query;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.cds.api.example.constant.APIConstants;
import com.cds.api.example.model.ExampleVO;
import com.cds.base.api.service.GeneralQueryService;
import com.cds.base.common.page.Page;
import com.cds.base.common.page.PageResult;
import com.cds.base.common.result.ResponseResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Description [name]查询服务
 * @Notes 未填写备注
 * @author [author]
 * @Date [date]
 */
@Api(value = "[name]查询服务", tags = {"[name]查询"})
@FeignClient(name = APIConstants.APP_NAME)
public interface ExampleQueryService extends GeneralQueryService<ExampleVO> {

    // 前缀
    static final String PREFIX = BASE_PREFIX + "/ExampleQueryService";

    @Override
    @ApiOperation(value = "是否存在")
    @PostMapping(PREFIX + "/contains")
    ResponseResult<Boolean> contains(@RequestBody @NotNull ExampleVO example);

    @Override
    @ApiOperation(value = "详情")
    @PostMapping(PREFIX + "/detail")
    ResponseResult<ExampleVO> detail(@RequestParam(value = "num", required = true) String num);

    @Override
    @ApiOperation(value = "指定条件查询")
    @PostMapping(PREFIX + "/queryAll")
    ResponseResult<List<ExampleVO>> queryAll(@RequestBody @NotNull ExampleVO example);

    @Override
    @ApiOperation(value = "分页查询")
    @PostMapping(PREFIX + "/queryPagingList")
    ResponseResult<PageResult<ExampleVO>> queryPagingList(@RequestBody @NotNull Page<ExampleVO> examplePage);

}
