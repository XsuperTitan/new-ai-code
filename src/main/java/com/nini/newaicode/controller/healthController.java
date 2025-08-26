package com.nini.newaicode.controller;

import com.nini.newaicode.common.BaseResponse;
import com.nini.newaicode.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/health")
public class healthController {
    @GetMapping("/")
    public BaseResponse<String> healthcheck() {
        return ResultUtils.success("OK");
    }

}
