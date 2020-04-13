package GoodsSortControl.service;


import GoodsSortControl.dao.GoodsSortDao;
import GoodsSortControl.entity.GoodsSortInfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import util.AppResponse;

import java.util.List;

public class GoodsSortService {
    @Autowired

    private GoodsSortDao goodsSortDao;
    @Transactional(rollbackFor = Exception.class)
    /**
     * demo 新增轮播图
     * @param goodsInfo
     * @return
     * @Author 刘桂鹏
     * @Date 2020-03-21
     */

    public AppResponse addGoodsSort(GoodsSortInfo goodsSortInfo){
        int countSortNum = goodsSortDao.countGoodsSort(goodsSortInfo);
        int countGoodsCode = goodsSortDao.countGoodsCode(goodsSortInfo);
        //检测序号是否已存在
        if(countSortNum !=0){
            return  AppResponse.success("序号已存在，请重新排序");}
            //检测商品是否已被选择
        if(countGoodsCode !=0){
            return  AppResponse.success("商品已选择，请重新选择");}
        goodsSortInfo.setIsDeleted(0);
        int count =goodsSortDao.addGoodsSort(goodsSortInfo);
        if (count == 0) {
            return AppResponse.success("新增失败");
        }
        else
            return AppResponse.success("新增成功");
    }

    /**
     * 查询轮播图列表
     * @param goodsSortInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse listGoodsSort(GoodsSortInfo goodsSortInfo){

        PageHelper.startPage(goodsSortInfo.getPageNum(), goodsSortInfo.getPageSize());
        List<GoodsSortInfo> goodsSortInfoList = goodsSortDao.listGoodsSort(goodsSortInfo);
        PageInfo<GoodsSortInfo> pageData = new PageInfo<>(goodsSortInfoList);

        return AppResponse.success("从数据库查询成功!", pageData);

    }

    /**
     * 删除商品分类
     * @param goodsSortInfo
     * @return
     * @author 刘桂鹏
     *
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteGoodsSort(GoodsSortInfo goodsSortInfo) {

        // 删除用户
        int count = goodsSortDao.deleteGoodsSort(goodsSortInfo);
        if (0 == count) {
            return AppResponse.bizError("删除失败，请重试！");
        }
        return AppResponse.success("删除成功！");
    }

    /**
     * 修改轮播图
     * @param goodsSortInfo
     * @return
     * @author 刘桂鹏
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateGoodsSort(GoodsSortInfo goodsSortInfo) {
        int countSortNum = goodsSortDao.countGoodsSort(goodsSortInfo);
        int countGoodsCode = goodsSortDao.countGoodsCode(goodsSortInfo);
        AppResponse appResponse = AppResponse.success("修改成功");
        //检测序号是否已存在
        if(countSortNum !=0){
            return  AppResponse.success("序号已存在，请重新排序");}
        //检测商品是否已被选择
        if(countGoodsCode !=0){
            return  AppResponse.success("商品已选择，请重新选择");}
        // 修改轮播图信息
        int count = goodsSortDao.updateGoodsSort(goodsSortInfo);
        if (0 == count) {
            appResponse = AppResponse.versionError("数据有变化，请刷新！");
            return appResponse;
        }
        return appResponse;
    }


    /**
     * 查询轮播图详情
     * @param goodsSortSortNum
     * @return
     * @author 刘桂鹏
     */
    public AppResponse getGoodsSortBySort(GoodsSortInfo goodsSortSortNum) {
        GoodsSortInfo goodsSortInfo  = goodsSortDao.getGoodsSortByCode(goodsSortSortNum);
        return AppResponse.success("查询成功！", goodsSortInfo);
    }


}
