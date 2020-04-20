package PictureControl.service;


import GoodsControl.dao.GoodsDao;
import GoodsControl.entity.GoodsInfo;
import PictureControl.dao.PictureDao;
import PictureControl.entity.PictureInfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import util.AppResponse;

import java.util.List;
@Service
public class PictureService {
    @Autowired

    private PictureDao pictureDao;
    @Transactional(rollbackFor = Exception.class)
    /**
     * demo 新增轮播图
     * @param goodsInfo
     * @return
     * @Author 刘桂鹏
     * @Date 2020-03-21
     */

    public AppResponse addPicture(PictureInfo pictureInfo){
        int countSortNum = pictureDao.countPictureNum(pictureInfo);
        int countGoodsCode = pictureDao.countGoodsCode(pictureInfo);
        //检测序号是否已存在
        if(countSortNum !=0){
            return  AppResponse.success("序号已存在，请重新排序");}
            //检测商品是否已被选择
        if(countGoodsCode !=0){
            return  AppResponse.success("商品已选择，请重新选择");}
        pictureInfo.setIsDeleted(0);
        int count =pictureDao.addPicture(pictureInfo);
        if (count == 0) {
            return AppResponse.success("新增失败");
        }
        else
            return AppResponse.success("新增成功");
    }

    /**
     * 查询轮播图列表
     * @param pictureInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse listPictureByPage(PictureInfo pictureInfo){

        PageHelper.startPage(pictureInfo.getPageNum(), pictureInfo.getPageSize());
        List<PictureInfo> pictureInfoList = pictureDao.listPictureByPage(pictureInfo);
        PageInfo<PictureInfo> pageData = new PageInfo<>(pictureInfoList);

        return AppResponse.success("从数据库查询成功!", pageData);

    }

    /**
     * 删除轮播图
     * @param pictureInfo
     * @return
     * @author 刘桂鹏
     *
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deletePicture(PictureInfo pictureInfo) {

        // 删除轮播图
        int count = pictureDao.deletePicture(pictureInfo);
        if (0 == count) {
            return AppResponse.bizError("删除失败，请重试！");
        }
        return AppResponse.success("删除成功！");
    }

    /**
     * 修改轮播图状态
     * @param pictureInfo
     * @return
     * @author 刘桂鹏
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updatePicture(PictureInfo pictureInfo) {
        AppResponse appResponse = AppResponse.success("修改成功");

        // 修改轮播图状态
        int count = pictureDao.updatePicture(pictureInfo);
        if (0 == count) {
            appResponse = AppResponse.versionError("数据有变化，请刷新！");
            return appResponse;
        }
        return appResponse;
    }


    /**
     * 查询轮播图详情
     * @param pictureSortNum
     * @return
     * @author 刘桂鹏
     */
    public AppResponse getPictureBySort(PictureInfo pictureSortNum) {
        PictureInfo pictureInfo  = pictureDao.getPictureBySort(pictureSortNum);
        return AppResponse.success("查询成功！", pictureInfo);
    }
    /**
     * 查询商品列表
     * @param goodsInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse listGoods(GoodsInfo goodsInfo){

        PageHelper.startPage(goodsInfo.getPageNum(), goodsInfo.getPageSize());
        List<GoodsInfo> goodsInfoList = pictureDao.listGoods(goodsInfo);
        PageInfo<GoodsInfo> pageData = new PageInfo<>(goodsInfoList);

        return AppResponse.success("从数据库查询成功!", pageData);

    }

}
