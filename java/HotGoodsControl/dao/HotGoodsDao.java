package HotGoodsControl.dao;

import GoodsControl.entity.GoodsInfo;
import HotGoodsControl.entity.HotGoodsInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**@ClassName GoodsDao
 * @author 刘桂鹏
 * @time  2020-3-26
 */
@Mapper
public interface HotGoodsDao {

     /**
     *查询热门商品列表
     * @param hotGoodsInfo
     * @return
     */
    List<HotGoodsInfo> listHotGoodsByPage(HotGoodsInfo hotGoodsInfo);


    /**
     *查询热门商品展示数量
     * @param hotGoodsInfo
     * @return
     */
    List<HotGoodsInfo> listHotGoodsShowNum(HotGoodsInfo hotGoodsInfo);


    /**
     * 统计商品名数量
     * @param hotGoodsInfo
     * @return
     */
    int countPictureNum(HotGoodsInfo hotGoodsInfo);

    /**
     * 新增热门商品
     * @param hotGoodsInfo
     * @return
     */

    int addHotGoods(HotGoodsInfo hotGoodsInfo);

    /**
     * 显示热门商品详情
     * @param hotGoodsInfo
     * @return
     */
   HotGoodsInfo getHotGoods(HotGoodsInfo hotGoodsInfo);

    /**
     * 修改热门商品
     * @param hotGoodsInfo
     * @return
     */
    int updateHotGoods(HotGoodsInfo hotGoodsInfo);

    /**
     * 修改热门商品展示数量
     * @param hotGoodsInfo
     * @return
     */
    int updateHotGoodsShowNum(HotGoodsInfo hotGoodsInfo);

    /**
     * 删除热门商品
     * @param hotGoodsInfo
     * @return
     */
    int deleteHotGoods(HotGoodsInfo hotGoodsInfo);

    /**
     * 统计商品编码数量
     * @param hotGoodsInfo
     * @return
     */
    int countGoodsCode(HotGoodsInfo hotGoodsInfo);

    /**
     * 统计排序号个数
     * @param hotGoodsInfo
     * @return
     */
    int countHotGoodsNum(HotGoodsInfo hotGoodsInfo);

    /**
     * 查询商品列表篇
     * @param goodsInfo
     * @return
     */
    List<GoodsInfo> listGoods(GoodsInfo goodsInfo);

}
