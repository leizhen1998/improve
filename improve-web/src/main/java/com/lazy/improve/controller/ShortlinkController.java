package com.lazy.improve.controller;

import com.lazy.improve.service.ShortlinkService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: ShortlinkController
 * Package: com.lazy.improve.controller.shortlink
 * Description: 短链接
 *
 * @Author leizhen
 * @Create 2023/3/4 20:40
 * @Version 1.0
 */
@Api(value = "短链接 API")
@RestController
@RequestMapping("/shortlink")
public class ShortlinkController {
    @Resource
    private ShortlinkService shortlinkService;

    /**
     * 短链接跳转
     * @param urlId
     * @param request
     * @param response
     * @throws IOException
     */
    @ApiOperation(value = "短链接重定向跳转")
    @ApiImplicitParam(name = "urlId", value = "短链接 ID")
    @GetMapping("/{urlId}")
    public void skip(@PathVariable("urlId") String urlId, HttpServletRequest request, HttpServletResponse response) throws IOException {
        shortlinkService.skip(urlId, request, response);
    }
}
