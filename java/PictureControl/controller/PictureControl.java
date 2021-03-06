package PictureControl.controller;

import GoodsControl.entity.GoodsInfo;
import PictureControl.entity.PictureInfo;
import PictureControl.service.PictureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.AppResponse;

import javax.annotation.Resource;
@RestController
@RequestMapping("pc/picture")
public class PictureControl {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Resource
    private PictureService pictureService;

    /**
     * demo 新增轮播图
     *
     * @param pictureInfo
     * @return AppResponse
     * @author Liu
     * @Date 2020-04-10
     */

    @PostMapping("/addPicture")
    public AppResponse addPicture(PictureInfo pictureInfo) {
        try {
            return pictureService.addPicture(pictureInfo);

        } catch (Exception e) {
            logger.error("增加轮播图异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }

    /**
     * 分页查询轮播图
     * @param pictureInfo
     * @return
     */
    @PostMapping("/listPictureByPage")
    public AppResponse listPictureByPage(PictureInfo pictureInfo) {
        try {
            return pictureService.listPictureByPage(pictureInfo);
        } catch (Exception e) {
            logger.error("查询轮播图列表异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }

    /**
     * 删除轮播图
     * @param pictureInfo
     * @return
     */
    @PostMapping("/deletePicture")
    public AppResponse deletePicture(PictureInfo pictureInfo) {
        try {
            return pictureService.deletePicture(pictureInfo);
        } catch (Exception e) {
            logger.error("删除轮播图异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 修改轮播图
     * @param pictureInfo
     * @return
     */
    @PostMapping("/updatePicture")
    public AppResponse updatePicture(PictureInfo pictureInfo) {
        try {
            return pictureService.updatePicture(pictureInfo);
        } catch (Exception e) {
            logger.error("修改轮播图异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询轮播图详情
     * @param pictureInfo
     * @return
     */

    @PostMapping("/getPictureByCode")
    public AppResponse getPictureBySort(PictureInfo pictureInfo) {
        try {
            return pictureService.getPictureBySort(pictureInfo);
        } catch (Exception e) {
            logger.error("修改轮播图异常", e);
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
            return pictureService.listGoods(goodsInfo);
        } catch (Exception e) {
            logger.error("查询轮播图列表异常", e);
            System.out.println(e.toString());
            throw e;
        }


    }

}
