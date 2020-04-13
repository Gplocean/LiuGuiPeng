package GoodsControl.dao;

import GoodsControl.entity.GoodsInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**@ClassName GoodsDao
 * @author 刘桂鹏
 * @time  2020-3-26
 */
@Mapper
public interface GoodsDao {
    /**

    /**
     *查询商品列表
     * @param goodsInfo
     * @return
     */
      List<GoodsInfo> listGoodsByPage(GoodsInfo goodsInfo);


    /**
     * 统计商品名数量
     * @param goodsInfo
     * @return
     */
       int countGoodsName(GoodsInfo goodsInfo);

    /**
     * 新增商品
     * @param goodsInfo
     * @return
     */

       int addGoods(GoodsInfo goodsInfo);

    /**
     * 删除商品
     * @param goodsCode
     * @return
     */
      GoodsInfo getGoodsByCode(GoodsInfo goodsCode);

    /**
     * 修改商品
     * @param goodsInfo
     * @return
     */
      int updateGoods(GoodsInfo goodsInfo);

    /**
     * 删除商品
     * @param goodsInfo
     * @return
     */
      int deleteGoods(GoodsInfo goodsInfo);
}
