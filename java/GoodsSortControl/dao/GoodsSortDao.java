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
     *查询商品一级分类
     * @param goodsSortInfo
     * @return
     */
    List<GoodsSortInfo> listFirstGoodsSort(GoodsSortInfo goodsSortInfo);

    /**
     *查询商品二级分类
     * @param goodsSortInfo
     * @return
     */
    List<GoodsSortInfo> listSecondGoodsSort(GoodsSortInfo goodsSortInfo);


    /**
     * 统计商品名数量
     * @param goodsSortInfo
     * @return
     */
    int countGoodsSort(GoodsSortInfo goodsSortInfo);

    /**
     * 新增商品
     * @param goodsSortInfo
     * @return
     */

    int addGoodsSort(GoodsSortInfo goodsSortInfo);

    /**
     * 删除商品
     * @param goodsSortInfo
     * @return
     */
   GoodsSortInfo getGoodsSortByCode(GoodsSortInfo goodsSortInfo);

    /**
     * 修改商品
     * @param goodsSortInfo
     * @return
     */
    int updateGoodsSort(GoodsSortInfo goodsSortInfo);

    /**
     * 删除商品分类
     * @param goodsSortInfo
     * @return
     */
    int deleteGoodsSort(GoodsSortInfo goodsSortInfo);

    /**
     * 统计商品编码数量
     * @param goodsSortInfo
     * @return
     */
    int countGoodsCode(GoodsSortInfo goodsSortInfo);
}
