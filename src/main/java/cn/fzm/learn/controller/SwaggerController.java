package cn.fzm.learn.controller;

import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("/swagger")
@Api("SwaggerController相关api说明")
public class SwaggerController {
    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ApiOperation("获取用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "header", name = "username", dataType = "String", required = true, value = "用户的姓名", defaultValue = "zhaojigang"),
            @ApiImplicitParam(paramType = "query", name = "password", dataType = "String", required = true, value = "用户的密码", defaultValue = "wangna")
//            @ApiImplicitParam(paramType = "query", name = "msg", dataType = "String", required = false, value = "url参数", defaultValue = "好的")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 403, message = "禁用"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    public Map hello(String msg) {
        Map<String, String> map = new HashMap<>();
        map.put("user", "test");
        map.put("msg", msg);
        return map;
    }

}