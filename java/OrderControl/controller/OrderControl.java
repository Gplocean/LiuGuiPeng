package OrderControl.controller;

import GoodsSortControl.entity.GoodsSortInfo;
import OrderControl.entity.OrderInfo;
import OrderControl.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.AppResponse;

import javax.annotation.Resource;

@RestController
@RequestMapping("/pc/order")
public class OrderControl {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Resource
    private OrderService orderService;

    /**
     * demo 查询订单详情
     *
     * @param orderInfo
     * @return AppResponse
     * @author Liu
     * @Date 2020-04-10
     */
    @PostMapping("/getListOrder")
    public AppResponse listFirstOrder(OrderInfo orderInfo) {
        try {
            return orderService.listOrder(orderInfo);
        } catch (Exception e) {
            logger.error("查询商品分类异常", e);
            System.out.println(e.toString());
            throw e;
        }


    }


    /**
     *
     *  分页查询订单
     * @param orderInfo
     * @return AppResponse
     * @author Liu
     * @Date 2020-04-10
     */
    @PostMapping("/listOrders")
    public AppResponse listSecondOrder(OrderInfo orderInfo) {
        try {
            return orderService.listOrderByPage(orderInfo);
        } catch (Exception e) {
            logger.error("查询订单列表异常", e);
            System.out.println(e.toString());
            throw e;
        }


    }

    /**
     * demo 修改订单状态
     *
     * @param orderInfo
     * @return AppResponse
     * @author Liu
     * @Date 2020-04-10
     */
    @PostMapping("/updateOrderState")
    public AppResponse updateOrder(OrderInfo orderInfo) {
        try {
            return orderService.updateOrder(orderInfo);
        } catch (Exception e) {
            logger.error("修改订单状态常", e);
            System.out.println(e.toString());
            throw e;
        }
    }


}
