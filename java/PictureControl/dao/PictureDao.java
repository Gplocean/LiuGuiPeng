package PictureControl.dao;

import GoodsControl.entity.GoodsInfo;
import PictureControl.entity.PictureInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**@ClassName GoodsDao
 * @author 刘桂鹏
 * @time  2020-3-26
 */
@Mapper
public interface PictureDao {
    /**

     /**
     *查询商品列表
     * @param pictureInfo
     * @return
     */
    List<PictureInfo> listPictureByPage(PictureInfo pictureInfo);


    /**
     * 统计商品名数量
     * @param pictureInfo
     * @return
     */
    int countPictureNum(PictureInfo pictureInfo);

    /**
     * 新增商品
     * @param pictureInfo
     * @return
     */

    int addPicture(PictureInfo pictureInfo);

    /**
     * 删除商品
     * @param pictureInfo
     * @return
     */
   PictureInfo getPictureBySort(PictureInfo pictureInfo);

    /**
     * 修改商品
     * @param pictureInfo
     * @return
     */
    int updatePicture(PictureInfo pictureInfo);

    /**
     * 删除商品
     * @param pictureInfo
     * @return
     */
    int deletePicture(PictureInfo pictureInfo);

    /**
     * 统计商品编码数量
     * @param pictureInfo
     * @return
     */
    int countGoodsCode(PictureInfo pictureInfo);

    /**
     * 查询商品列表篇
     * @param goodsInfo
     * @return
     */
    List<GoodsInfo> listGoods(GoodsInfo goodsInfo);

}
