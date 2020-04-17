package HotGoodsControl.service;


import GoodsControl.entity.GoodsInfo;
import HotGoodsControl.dao.HotGoodsDao;
import HotGoodsControl.entity.HotGoodsInfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import util.AppResponse;

import java.util.List;

@Service
public class HotGoodsService {
    @Autowired

    private HotGoodsDao hotGoodsDao;
    @Transactional(rollbackFor = Exception.class)
    /**
     * demo 新增热门商品
     * @param goodsInfo
     * @return
     * @Author 刘桂鹏
     * @Date 2020-03-21
     */

    public AppResponse addHotGoods(HotGoodsInfo hotGoodsInfo){
        int countHotGoodsNum = hotGoodsDao.countHotGoodsNum(hotGoodsInfo);
        int countGoodsCode = hotGoodsDao.countGoodsCode(hotGoodsInfo);
        //检测序号是否已存在
        if(countHotGoodsNum!=0){
            return  AppResponse.success("序号已存在，请重新排序");}
            //检测商品是否已被选择
        if(countGoodsCode !=0){
            return  AppResponse.success("商品已选择，请重新选择");}
        hotGoodsInfo.setIsDeleted(0);
        hotGoodsInfo.setCreateBy("刘桂鹏");
        int count =hotGoodsDao.addHotGoods(hotGoodsInfo);
        if (count == 0) {
            return AppResponse.success("新增失败");
        }
        else
            return AppResponse.success("新增成功");
    }

    /**
     * 查询热门商品列表
     * @param hotGoodsInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse listHotGoodsByPage(HotGoodsInfo hotGoodsInfo){

        PageHelper.startPage(hotGoodsInfo.getPageNum(), hotGoodsInfo.getPageSize());
        List<HotGoodsInfo> hotGoodsInfoList = hotGoodsDao.listHotGoodsByPage(hotGoodsInfo);
        PageInfo<HotGoodsInfo> pageData = new PageInfo<>(hotGoodsInfoList);

        return AppResponse.success("从数据库查询成功!", pageData);

    }

    /**
     * 删除热门商品
     * @param hotGoodsInfo
     * @return
     * @author 刘桂鹏
     *
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteHotGoods(HotGoodsInfo hotGoodsInfo) {

        // 删除用户
        int count = hotGoodsDao.deleteHotGoods(hotGoodsInfo);
        if (0 == count) {
            return AppResponse.bizError("删除失败，请重试！");
        }
        return AppResponse.success("删除成功！");
    }

    /**
     * 修改热门商品
     * @param hotGoodsInfo
     * @return
     * @author 刘桂鹏
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateHotGoods(HotGoodsInfo hotGoodsInfo) {
        int countSortNum = hotGoodsDao.countHotGoodsNum(hotGoodsInfo);
        int countGoodsCode = hotGoodsDao.countGoodsCode(hotGoodsInfo);
        AppResponse appResponse = AppResponse.success("修改成功");
        //检测序号是否已存在
        if(countSortNum !=0){
            return  AppResponse.success("序号已存在，请重新排序");}
        //检测商品是否已被选择
        if(countGoodsCode !=0){
            return  AppResponse.success("商品已选择，请重新选择");}
        // 修改轮播图信息
        int count = hotGoodsDao.updateHotGoods(hotGoodsInfo);
        if (0 == count) {
            appResponse = AppResponse.versionError("数据有变化，请刷新！");
            return appResponse;
        }
        return appResponse;
    }


    /**
     * 查询热门商品详情
     * @param hotGoodsSortNum
     * @return
     * @author 刘桂鹏
     */
    public AppResponse getHotGoods(HotGoodsInfo hotGoodsSortNum) {
        HotGoodsInfo hotGoodsInfo = hotGoodsDao.getHotGoods(hotGoodsSortNum);
        return AppResponse.success("查询成功！", hotGoodsInfo);
    }
    /**
     * 查询商品列表
     * @param goodsInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse listGoods(GoodsInfo goodsInfo){

        PageHelper.startPage(goodsInfo.getPageNum(), goodsInfo.getPageSize());
        List<GoodsInfo> goodsInfoList = hotGoodsDao.listGoods(goodsInfo);
        PageInfo<GoodsInfo> pageData = new PageInfo<>(goodsInfoList);

        return AppResponse.success("从数据库查询成功!", pageData);

    }

}
