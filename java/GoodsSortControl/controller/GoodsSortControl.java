package GoodsSortControl.controller;

import GoodsSortControl.entity.GoodsSortInfo;
import GoodsSortControl.service.GoodsSortService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.AppResponse;

import javax.annotation.Resource;

@RestController
@RequestMapping("/pc/goodsClassify")
public class GoodsSortControl {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Resource
    private GoodsSortService goodsSortService;

    /**
     * demo 新增商品分类
     *
     * @param goodsSortInfo
     * @return AppResponse
     * @author Liu
     * @Date 2020-04-10
     */

    @PostMapping("/addGoodsClassify")
    public AppResponse addGoodsSort(GoodsSortInfo goodsSortInfo) {
        try {
            return goodsSortService.addGoodsSort(goodsSortInfo);

        } catch (Exception e) {
            logger.error("增加轮播图异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }
    /**
     * demo 查询商品一级分类
     *
     * @param goodsSortInfo
     * @return AppResponse
     * @author Liu
     * @Date 2020-04-10
     */
    @PostMapping("/listAllGoodsClassify")
    public AppResponse listFirstGoodsSort(GoodsSortInfo goodsSortInfo) {
        try {
            return goodsSortService.listFirstGoodsSort(goodsSortInfo);
        } catch (Exception e) {
            logger.error("查询商品分类异常", e);
            System.out.println(e.toString());
            throw e;
        }


    }


    /**
     * demo 查询商品二级分类
     *
     * @param goodsSortInfo
     * @return AppResponse
     * @author Liu
     * @Date 2020-04-10
     */
    @PostMapping("/listSecondClassify")
    public AppResponse listSecondGoodsSort(GoodsSortInfo goodsSortInfo) {
        try {
            return goodsSortService.listSecondGoodsSort(goodsSortInfo);
        } catch (Exception e) {
            logger.error("查询商品二级分类异常", e);
            System.out.println(e.toString());
            throw e;
        }


    }
    /**
     * demo 删除商品分类
     *
     * @param goodsSortInfo
     * @return AppResponse
     * @author Liu
     * @Date 2020-04-10
     */
    @PostMapping("/deleteGoodsClassify")
    public AppResponse deleteGoodsSort(GoodsSortInfo goodsSortInfo) {
        try {
            return goodsSortService.deleteGoodsSort(goodsSortInfo);
        } catch (Exception e) {
            logger.error("删除商品分类异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * demo 修改商品分类
     *
     * @param goodsSortInfo
     * @return AppResponse
     * @author Liu
     * @Date 2020-04-10
     */
    @PostMapping("/updateGoodsClassify")
    public AppResponse updateGoodsSort(GoodsSortInfo goodsSortInfo) {
        try {
            return goodsSortService.updateGoodsSort(goodsSortInfo);
        } catch (Exception e) {
            logger.error("修改商品分类异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询商品分类详情
     * @param goodsSortInfo
     * @return
     */

    @PostMapping("/getGoodsClassify")
    public AppResponse getGoodsSortByCode(GoodsSortInfo goodsSortInfo) {
        try {
            return goodsSortService.getGoodsSortBySort(goodsSortInfo);
        } catch (Exception e) {
            logger.error("查询商品分类详情异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }


}
