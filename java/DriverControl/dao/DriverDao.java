package DriverControl.dao;

import DriverControl.entity.DriverInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**@ClassName GoodsDao
 * @author 刘桂鹏
 * @time  2020-3-26
 */
@Mapper
public interface DriverDao {


    /**
     *查询热门商品展示数量
     * @param driverInfo
     * @return
     */
    List<DriverInfo> listDriver(DriverInfo driverInfo);


    /**
     * 新增热门商品
     * @param driverInfo
     * @return
     */

    int addDriver(DriverInfo driverInfo);

    /**
     * 显示热门商品详情
     * @param driverInfo
     * @return
     */
   DriverInfo getDriver(DriverInfo driverInfo);

    /**
     * 修改热门商品
     * @param driverInfo
     * @return
     */
    int updateDriver(DriverInfo driverInfo);
    

    /**
     * 删除热门商品
     * @param driverInfo
     * @return
     */
    int deleteDriver(DriverInfo driverInfo);


    /**
     * 统计店长编号个数
     * @param driverInfo
     * @return
     */
    int countDriverName(DriverInfo driverInfo);
    /**
     * 统计店长编号个数
     * @param driverInfo
     * @return
     */
    int countDriverCode(DriverInfo driverInfo);



}
