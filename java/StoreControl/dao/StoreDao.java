package StoreControl.dao;

import GoodsControl.entity.GoodsInfo;
import StoreControl.entity.StoreInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**@ClassName GoodsDao
 * @author 刘桂鹏
 * @time  2020-3-26
 */
@Mapper
public interface StoreDao {

     /**
     *查询热门商品列表
     * @param storeInfo
     * @return
     */
    List<StoreInfo> listStoreByPage(StoreInfo storeInfo);


    /**
     *查询热门商品展示数量
     * @param storeInfo
     * @return
     */
    List<StoreInfo> listStoreShowNum(StoreInfo storeInfo);


    /**
     * 统计商品名数量
     * @param storeInfo
     * @return
     */
    int countPictureNum(StoreInfo storeInfo);

    /**
     * 新增热门商品
     * @param storeInfo
     * @return
     */

    int addStore(StoreInfo storeInfo);

    /**
     * 显示热门商品详情
     * @param storeInfo
     * @return
     */
   StoreInfo getStore(StoreInfo storeInfo);

    /**
     * 修改热门商品
     * @param storeInfo
     * @return
     */
    int updateStore(StoreInfo storeInfo);

    /**
     * 修改热门商品展示数量
     * @param storeInfo
     * @return
     */
    int updateStoreShowNum(StoreInfo storeInfo);

    /**
     * 删除热门商品
     * @param storeInfo
     * @return
     */
    int deleteStore(StoreInfo storeInfo);

    /**
     * 统计商品编码数量
     * @param storeInfo
     * @return
     */
    int countGoodsCode(StoreInfo storeInfo);

    /**
     * 统计店长编号个数
     * @param storeInfo
     * @return
     */
    int countHostCode(StoreInfo storeInfo);
    /**
     * 统计店长编号个数
     * @param storeInfo
     * @return
     */
    int countStoreCode(StoreInfo storeInfo);



}
