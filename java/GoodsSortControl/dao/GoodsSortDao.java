package GoodsSortControl.dao;

import GoodsSortControl.entity.GoodsSortInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**@ClassName GoodsDao
 * @author 刘桂鹏
 * @time  2020-3-26
 */
@Mapper
public interface GoodsSortDao {
    /**

     /**
     *查询商品分类
     * @param pictureInfo
     * @return
     */
    List<GoodsSortInfo> listGoodsSort(GoodsSortInfo pictureInfo);


    /**
     * 统计商品名数量
     * @param pictureInfo
     * @return
     */
    int countGoodsSort(GoodsSortInfo pictureInfo);

    /**
     * 新增商品
     * @param pictureInfo
     * @return
     */

    int addGoodsSort(GoodsSortInfo pictureInfo);

    /**
     * 删除商品
     * @param pictureInfo
     * @return
     */
   GoodsSortInfo getGoodsSortByCode(GoodsSortInfo pictureInfo);

    /**
     * 修改商品
     * @param pictureInfo
     * @return
     */
    int updateGoodsSort(GoodsSortInfo pictureInfo);

    /**
     * 删除商品
     * @param pictureInfo
     * @return
     */
    int deleteGoodsSort(GoodsSortInfo pictureInfo);

    /**
     * 统计商品编码数量
     * @param pictureInfo
     * @return
     */
    int countGoodsCode(GoodsSortInfo pictureInfo);
}
