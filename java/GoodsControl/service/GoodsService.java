package GoodsControl.service;

import GoodsControl.dao.GoodsDao;
import GoodsControl.entity.GoodsInfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import util.AppResponse;


import java.util.List;


/**
 * @DescriptionDemo 实现类
 * @Author 刘桂鹏
 * @Date 2020-03-26
 */
@Service
public class GoodsService {


 @Autowired


    private GoodsDao goodsDao;
    @Transactional(rollbackFor = Exception.class)
    /**
     * demo 新增用户
     * @param goodsInfo
     * @return
     * @Author dingning
     * @Date 2020-03-21
     */

    public  AppResponse addGoods(GoodsInfo goodsInfo){
        int countGoodsName = goodsDao.countGoodsName(goodsInfo);
        if(countGoodsName !=0){
        return  AppResponse.success("商品已存在，请重新输入");}
        goodsInfo.setIsDeleted(0);
        int count =goodsDao.addGoods(goodsInfo);
        if (count == 0) {
            return AppResponse.success("新增失败");
        }
        else
            return AppResponse.success("新增成功");
    }

    /**
     * 查询商品列表
     * @param goodsInfo
     * @return
     * @author liuguipeng
     */
   public AppResponse listGoods(GoodsInfo goodsInfo){

            PageHelper.startPage(goodsInfo.getPageNum(), goodsInfo.getPageSize());
            List<GoodsInfo> goodsInfoList = goodsDao.listGoodsByPage(goodsInfo);
            PageInfo<GoodsInfo> pageData = new PageInfo<>(goodsInfoList);

            return AppResponse.success("从数据库查询成功!", pageData);

    }

    /**
     * 删除商品
     * @param goodsInfo
     * @return
     * @author 刘桂鹏
     *
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteGoods(GoodsInfo goodsInfo) {

        // 删除用户
        int count = goodsDao.deleteGoods(goodsInfo);
        if (0 == count) {
            return AppResponse.bizError("删除失败，请重试！");
        }
        return AppResponse.success("删除成功！");
    }

    /**
     * 修改用户
     * @param goodsInfo
     * @return
     * @author 刘桂鹏
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateGoods(GoodsInfo goodsInfo) {
        AppResponse appResponse = AppResponse.success("修改成功");
        // 校验账号是否存在
        int countGoodsName = goodsDao.countGoodsName(goodsInfo);
        if (0 != countGoodsName) {
            return AppResponse.bizError("商品已存在，请重新输入！");
        }
        // 修改用户信息
        int count = goodsDao.updateGoods(goodsInfo);
        if (0 == count) {
            appResponse = AppResponse.versionError("数据有变化，请刷新！");
            return appResponse;
        }
        return appResponse;
    }


    /**
     * 查询商品详情
     * @param goodsCode
     * @return
     * @author 刘桂鹏
     */
    public AppResponse getGoodsByCode(GoodsInfo goodsCode) {
        GoodsInfo goodsInfo = goodsDao.getGoodsByCode(goodsCode);
        return AppResponse.success("查询成功！", goodsInfo);
    }
}
