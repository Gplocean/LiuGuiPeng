package StoreControl.service;


import StoreControl.dao.StoreDao;
import StoreControl.entity.StoreInfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import util.AppResponse;

import java.util.List;

@Service
public class StoreService {
    @Autowired

    private StoreDao storeDao;
    @Transactional(rollbackFor = Exception.class)
    /**
     * demo 新增门店
     * @param goodsInfo
     * @return
     * @Author 刘桂鹏
     * @Date 2020-03-21
     */

    public AppResponse addStore(StoreInfo storeInfo){
        int countStoreCode = storeDao.countStoreCode(storeInfo);
        //检测门店号是否存在
        if(countStoreCode!=0){
            return  AppResponse.success("门店已存在，请重新排序");}

        storeInfo.setIsDeleted(0);
        storeInfo.setCreateBy("刘桂鹏");
        int count = storeDao.addStore(storeInfo);
        if (count == 0) {
            return AppResponse.success("新增失败");
        }
        else
            return AppResponse.success("新增成功");
    }

    /**
     * 查询门店列表
     * @param storeInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse listStoreByPage(StoreInfo storeInfo){

        PageHelper.startPage(storeInfo.getPageNum(), storeInfo.getPageSize());
        List<StoreInfo> storeInfoList = storeDao.listStoreByPage(storeInfo);
        PageInfo<StoreInfo> pageData = new PageInfo<>(storeInfoList);

        return AppResponse.success("从数据库查询成功!", pageData);

    }

    /**
     * 删除门店
     * @param storeInfo
     * @return
     * @author 刘桂鹏
     *
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteStore(StoreInfo storeInfo) {

        // 删除门店
        int count = storeDao.deleteStore(storeInfo);
        if (0 == count) {
            return AppResponse.bizError("删除失败，请重试！");
        }
        return AppResponse.success("删除成功！");
    }

    /**
     * 修改门店
     * @param storeInfo
     * @return
     * @author 刘桂鹏
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateStore(StoreInfo storeInfo) {
        int countStoreCode = storeDao.countStoreCode(storeInfo);
        AppResponse appResponse = AppResponse.success("修改成功");
        if(countStoreCode !=0){
            return  AppResponse.success("店铺已存在，请重新输入");}
        int count = storeDao.updateStore(storeInfo);
        if (0 == count) {
            appResponse = AppResponse.versionError("数据有变化，请刷新！");
            return appResponse;
        }
        return appResponse;
    }


    /**
     * 查询门店详情
     * @param StoreInfo
     * @return
     * @author 刘桂鹏
     */
    public AppResponse getStore(StoreInfo StoreInfo) {
        StoreInfo storeInfo = storeDao.getStore(StoreInfo);
        return AppResponse.success("查询成功！", storeInfo);
    }


}
