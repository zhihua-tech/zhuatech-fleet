/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.fleet.controller;

import cn.zhuatech.fleet.common.ApiResponse;
import cn.zhuatech.fleet.service.DispatchReadinessService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController
@RequestMapping("/api/admin/dispatch-readiness")
public class DispatchReadinessController {
    private final DispatchReadinessService service;
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public DispatchReadinessController(DispatchReadinessService service) { this.service = service; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @PostMapping
    ApiResponse<DispatchReadinessService.DispatchDecision> evaluate(
        @Valid @RequestBody DispatchReadinessService.DispatchRequest request) {
        return ApiResponse.ok(service.evaluate(request));
    }
}
