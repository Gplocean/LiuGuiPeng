package GoodsSortControl.service;

import GoodsSortControl.dao.GoodsSortDao;
import GoodsSortControl.entity.GoodsSortInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import util.AppResponse;

import java.util.List;
@Service
public class GoodsSortService {
    @Autowired

    private GoodsSortDao goodsSortDao;
    @Transactional(rollbackFor = Exception.class)
    /**
     * demo 新增商品分类
     * @param goodsInfo
     * @return
     * @Author 刘桂鹏
     * @Date 2020-03-21
     */

    public AppResponse addGoodsSort(GoodsSortInfo goodsSortInfo){
        //检测分类名是否已存在
        int countSortName = goodsSortDao.countSortName(goodsSortInfo);
        if(countSortName !=0){
            return  AppResponse.success("分类已存在，请重新输入");}
        goodsSortInfo.setIsDeleted(0);
        int count =goodsSortDao.addGoodsSort(goodsSortInfo);
        if (count == 0) {
            return AppResponse.success("新增失败");
        }
        else
            return AppResponse.success("新增成功");
    }

    /**
     * 查询一级分类列表
     * @param goodsSortInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse listFirstGoodsSort(GoodsSortInfo goodsSortInfo){

       List<GoodsSortInfo> goodsSortInfoList = goodsSortDao.listFirstGoodsSort(goodsSortInfo);
        return AppResponse.success("查询成功！", goodsSortInfoList);

    }

    /**
     * 查询二级分类列表
     * @param goodsSortInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse listSecondGoodsSort(GoodsSortInfo goodsSortInfo){

        List<GoodsSortInfo> goodsSortInfoList = goodsSortDao.listSecondGoodsSort(goodsSortInfo);
        return AppResponse.success("查询成功！", goodsSortInfoList);

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

        // 删除商品分类
        int count = goodsSortDao.deleteGoodsSort(goodsSortInfo);
        if (0 == count) {
            return AppResponse.bizError("删除失败，请重试！");
        }
        return AppResponse.success("删除成功！");
    }

    /**
     * 修改商品分类
     * @param goodsSortInfo
     * @return
     * @author 刘桂鹏
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateGoodsSort(GoodsSortInfo goodsSortInfo) {
        AppResponse appResponse = AppResponse.success("修改成功");
        int countSortName = goodsSortDao.countGoodsSort(goodsSortInfo);
        //检测商品分类是否存在
        if(countSortName !=0){
            return  AppResponse.success("分类名已存在，请重新选择");}
        int count = goodsSortDao.updateGoodsSort(goodsSortInfo);
        if (0 == count) {
            appResponse = AppResponse.versionError("数据有变化，请刷新！");
            return appResponse;
        }
        return appResponse;
    }


    /**
     * 查询商品分类详情
     * @param goodsSortSortNum
     * @return
     * @author 刘桂鹏
     */
    public AppResponse getGoodsSortBySort(GoodsSortInfo goodsSortSortNum) {
        GoodsSortInfo goodsSortInfo  = goodsSortDao.getGoodsSortByCode(goodsSortSortNum);
        return AppResponse.success("查询成功！", goodsSortInfo);
    }


}
