package DriverControl.controller;

import DriverControl.entity.DriverInfo;
import DriverControl.service.DriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.AppResponse;

import javax.annotation.Resource;

@RestController
@RequestMapping("/pc/hotGoods")
public class DriverControl {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Resource
    private DriverService driverService;

    /**
     * demo 新增司机
     *
     * @param driverInfo
     * @return AppResponse
     * @author Liu
     * @Date 2020-04-10
     */

    @PostMapping("/addHotGoods")
    public AppResponse addDriver(DriverInfo driverInfo) {
        try {
            return driverService.addDriver(driverInfo);

        } catch (Exception e) {
            logger.error("增加司机异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }

    /**
     * 分页查询司机
     * @param driverInfo
     * @return
     */
    @PostMapping("/listHotGoods")
    public AppResponse listDriverByPage(DriverInfo driverInfo) {
        try {
            return driverService.listDriverByPage(driverInfo);
        } catch (Exception e) {
            logger.error("查询司机列表异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }

    /**
     * 删除司机
     * @param driverInfo
     * @return
     */
    @PostMapping("/deleteHotGoods")
    public AppResponse deleteDriver(DriverInfo driverInfo) {
        try {
            return driverService.deleteDriver(driverInfo);
        } catch (Exception e) {
            logger.error("删除司机异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 修改司机
     * @param driverInfo
     * @return
     */
    @PostMapping("/updateHotGoods")
    public AppResponse updateDriver(DriverInfo driverInfo) {
        try {
            return driverService.updateDriver(driverInfo);
        } catch (Exception e) {
            logger.error("修改司机异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询司机详情
     * @param driverInfo
     * @return
     */

    @PostMapping("/getHotGoods")
    public AppResponse getHotGoods(DriverInfo driverInfo) {
        try {
            return driverService.getDriver(driverInfo);
        } catch (Exception e) {
            logger.error("修改司机异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }


    }

