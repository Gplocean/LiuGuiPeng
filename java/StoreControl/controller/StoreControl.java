package StoreControl.controller;

import GoodsControl.entity.GoodsInfo;
import StoreControl.entity.StoreInfo;
import StoreControl.service.StoreService;
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
public class StoreControl {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Resource
    private StoreService storeService;

    /**
     * demo 新增热门商品
     *
     * @param storeInfo
     * @return AppResponse
     * @author Liu
     * @Date 2020-04-10
     */

    @PostMapping("/addHotGoods")
    public AppResponse addHotGoods(StoreInfo storeInfo) {
        try {
            return storeService.addStore(storeInfo);

        } catch (Exception e) {
            logger.error("增加热门商品异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }

    /**
     * 分页查询热门商品
     * @param storeInfo
     * @return
     */
    @PostMapping("/listHotGoods")
    public AppResponse listHotGoodsByPage(StoreInfo storeInfo) {
        try {
            return storeService.listStoreByPage(storeInfo);
        } catch (Exception e) {
            logger.error("查询热门商品列表异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }

    /**
     * 删除热门商品
     * @param storeInfo
     * @return
     */
    @PostMapping("/deleteHotGoods")
    public AppResponse deleteHotGoods(StoreInfo storeInfo) {
        try {
            return storeService.deleteStore(storeInfo);
        } catch (Exception e) {
            logger.error("删除热门商品异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 修改热门商品
     * @param storeInfo
     * @return
     */
    @PostMapping("/updateHotGoods")
    public AppResponse updateHotGoods(StoreInfo storeInfo) {
        try {
            return storeService.updateStore(storeInfo);
        } catch (Exception e) {
            logger.error("修改热门商品异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询热门商品详情
     * @param storeInfo
     * @return
     */

    @PostMapping("/getHotGoods")
    public AppResponse getHotGoods(StoreInfo storeInfo) {
        try {
            return storeService.getStore(storeInfo);
        } catch (Exception e) {
            logger.error("修改热门商品异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }


    }

