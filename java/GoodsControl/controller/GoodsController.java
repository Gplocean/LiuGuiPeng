package GoodsControl.controller;


import GoodsControl.entity.GoodsInfo;
import GoodsControl.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.AppResponse;


import javax.annotation.Resource;

/**
 * 商品管理
 * @author 刘桂鹏
 * @time 2020-3-26
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Resource
    private GoodsService goodsService;

    /**
     * demo 新增商品
     *
     * @param goodsInfo
     * @return AppResponse
     * @author Liu
     * @Date 2020-03-26
     */

    @PostMapping("/addGoods")
    public AppResponse addGoods(GoodsInfo goodsInfo) {
        try {
            return goodsService.addGoods(goodsInfo);

        } catch (Exception e) {
            logger.error("增加商品异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }

    @PostMapping("/listGoodsByPage")
    public AppResponse listGoods(GoodsInfo goodsInfo) {
        try {
            return goodsService.listGoods(goodsInfo);
        } catch (Exception e) {
            logger.error("查询商品列表异常", e);
            System.out.println(e.toString());
            throw e;
        }


    }

    @PostMapping("/deleteGoods")
    public AppResponse deleteGoods(GoodsInfo goodsInfo) {
        try {
            return goodsService.deleteGoods(goodsInfo);
        } catch (Exception e) {
            logger.error("删除商品异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    @PostMapping("/updateGoods")
    public AppResponse updateGoods(GoodsInfo goodsInfo) {
        try {
            return goodsService.updateGoods(goodsInfo);
        } catch (Exception e) {
            logger.error("修改商品异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    @PostMapping("/getGoodsByCode")
    public AppResponse getGoodsByCode(GoodsInfo goodsInfo) {
        try {
            return goodsService.getGoodsByCode(goodsInfo);
        } catch (Exception e) {
            logger.error("查询商品异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
