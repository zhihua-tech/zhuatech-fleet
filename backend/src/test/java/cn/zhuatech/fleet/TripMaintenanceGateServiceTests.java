/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.fleet;

import cn.zhuatech.fleet.service.TripMaintenanceGateService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
class TripMaintenanceGateServiceTests {
    private final TripMaintenanceGateService service = new TripMaintenanceGateService();

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @Test void blocksTripCrossingMaintenanceThreshold() {
        var result = service.evaluate(new TripMaintenanceGateService.Request(
            "沪A10001", 49800, 40000, 10000, 500, 0, 50, 4));
        assertEquals(200, result.distanceToServiceKm());
        assertEquals("BLOCK_DISPATCH", result.decision());
    }

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @Test void allowsHealthyVehicle() {
        var result = service.evaluate(new TripMaintenanceGateService.Request(
            "沪A10002", 42000, 40000, 10000, 300, 0, 30, 5));
        assertEquals("READY", result.decision());
    }
}
