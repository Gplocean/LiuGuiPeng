package DriverControl.service;


import DriverControl.dao.DriverDao;
import DriverControl.entity.DriverInfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import util.AppResponse;
import java.util.List;

@Service
public class DriverService {
    @Autowired

    private DriverDao driverDao;
    @Transactional(rollbackFor = Exception.class)
    /**
     * demo 新增司机
     * @param goodsInfo
     * @return
     * @Author 刘桂鹏
     * @Date 2020-03-21
     */

    public AppResponse addDriver(DriverInfo driverInfo){
        int countDriverName = driverDao.countDriverName(driverInfo);
        //检测司机名是否存在
        if(countDriverName!=0){
            return  AppResponse.success("司机已存在，请重新排序");}

        driverInfo.setIsDeleted(0);
        driverInfo.setCreateBy("刘桂鹏");
        int count = driverDao.addDriver(driverInfo);
        if (count == 0) {
            return AppResponse.success("新增失败");
        }
        else
            return AppResponse.success("新增成功");
    }

    /**
     * 查询司机列表
     * @param driverInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse listDriverByPage(DriverInfo driverInfo){

        PageHelper.startPage(driverInfo.getPageNum(), driverInfo.getPageSize());
        List<DriverInfo> driverInfoList = driverDao.listDriver(driverInfo);
        PageInfo<DriverInfo> pageData = new PageInfo<>(driverInfoList);

        return AppResponse.success("从数据库查询成功!", pageData);

    }

    /**
     * 删除司机
     * @param driverInfo
     * @return
     * @author 刘桂鹏
     *
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteDriver(DriverInfo driverInfo) {

        // 删除司机
        int count = driverDao.deleteDriver(driverInfo);
        if (0 == count) {
            return AppResponse.bizError("删除失败，请重试！");
        }
        return AppResponse.success("删除成功！");
    }

    /**
     * 修改司机
     * @param driverInfo
     * @return
     * @author 刘桂鹏
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateDriver(DriverInfo driverInfo) {
        int countdriverCode = driverDao.countDriverCode(driverInfo);
        AppResponse appResponse = AppResponse.success("修改成功");
        if(countdriverCode !=0){
            return  AppResponse.success("店铺已存在，请重新输入");}
        int count = driverDao.updateDriver(driverInfo);
        if (0 == count) {
            appResponse = AppResponse.versionError("数据有变化，请刷新！");
            return appResponse;
        }
        return appResponse;
    }


    /**
     * 查询司机详情
     * @param driverInfo
     * @return
     * @author 刘桂鹏
     */
    public AppResponse getDriver(DriverInfo driverInfo) {
        DriverInfo driverInfoList = driverDao.getDriver(driverInfo);
        return AppResponse.success("查询成功！", driverInfoList);
    }


}
