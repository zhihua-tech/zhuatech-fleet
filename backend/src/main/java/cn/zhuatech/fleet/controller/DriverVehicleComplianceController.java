/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.fleet.controller;

import cn.zhuatech.fleet.common.ApiResponse;
import cn.zhuatech.fleet.service.DriverVehicleComplianceService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController
@RequestMapping("/api/enterprise/fleet")
public class DriverVehicleComplianceController {
    private final DriverVehicleComplianceService service;
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public DriverVehicleComplianceController(DriverVehicleComplianceService service) { this.service = service; }

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @PostMapping("/driver-vehicle-compliance")
    public ApiResponse<DriverVehicleComplianceService.Assessment> assess(
        @Valid @RequestBody DriverVehicleComplianceService.Request request) {
        return ApiResponse.ok(service.assess(request));
    }
}
