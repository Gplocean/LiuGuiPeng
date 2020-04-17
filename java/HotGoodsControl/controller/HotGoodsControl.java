package HotGoodsControl.controller;

import GoodsControl.entity.GoodsInfo;
import HotGoodsControl.entity.HotGoodsInfo;
import HotGoodsControl.service.HotGoodsService;
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
public class HotGoodsControl {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Resource
    private HotGoodsService hotGoodsService;

    /**
     * demo 新增热门商品
     *
     * @param hotGoodsInfo
     * @return AppResponse
     * @author Liu
     * @Date 2020-04-10
     */

    @PostMapping("/addHotGoods")
    public AppResponse addHotGoods(HotGoodsInfo hotGoodsInfo) {
        try {
            return hotGoodsService.addHotGoods(hotGoodsInfo);

        } catch (Exception e) {
            logger.error("增加热门商品异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }

    /**
     * 分页查询热门商品
     * @param hotGoodsInfo
     * @return
     */
    @PostMapping("/listHotGoods")
    public AppResponse listHotGoodsByPage(HotGoodsInfo hotGoodsInfo) {
        try {
            return hotGoodsService.listHotGoodsByPage(hotGoodsInfo);
        } catch (Exception e) {
            logger.error("查询热门商品列表异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }

    /**
     * 删除热门商品
     * @param hotGoodsInfo
     * @return
     */
    @PostMapping("/deleteHotGoods")
    public AppResponse deleteHotGoods(HotGoodsInfo hotGoodsInfo) {
        try {
            return hotGoodsService.deleteHotGoods(hotGoodsInfo);
        } catch (Exception e) {
            logger.error("删除热门商品异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 修改热门商品
     * @param hotGoodsInfo
     * @return
     */
    @PostMapping("/updateHotGoods")
    public AppResponse updateHotGoods(HotGoodsInfo hotGoodsInfo) {
        try {
            return hotGoodsService.updateHotGoods(hotGoodsInfo);
        } catch (Exception e) {
            logger.error("修改热门商品异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询热门商品详情
     * @param hotGoodsInfo
     * @return
     */

    @PostMapping("/getHotGoods")
    public AppResponse getHotGoods(HotGoodsInfo hotGoodsInfo) {
        try {
            return hotGoodsService.getHotGoods(hotGoodsInfo);
        } catch (Exception e) {
            logger.error("修改热门商品异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }


    /**
     * 商品查询
     * @param goodsInfo
     * @return
     */
    @PostMapping("/listGoods")
    public AppResponse listGoods(GoodsInfo goodsInfo) {
        try {
            return hotGoodsService.listGoods(goodsInfo);
        } catch (Exception e) {
            logger.error("查询热门商品列表异常", e);
            System.out.println(e.toString());
            throw e;
        }


    }

}
