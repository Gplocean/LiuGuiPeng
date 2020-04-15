package OrderControl.dao;

import OrderControl.entity.OrderInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**@ClassName GoodsDao
 * @author 刘桂鹏
 * @time  2020-3-26
 */
@Mapper
public interface OrderDao {
    /**

     /**
     *查询订单列表
     * @param orderInfo
     * @return
     */
    List<OrderInfo> listOrderByPage(OrderInfo orderInfo);

    /**
     *查询订单详情
     * @param orderInfo
     * @return
     */
    List<OrderInfo> listOrder(OrderInfo orderInfo);


    /**
     * 修改订单状态
     * @param orderInfo
     * @return
     */
    int updateOrderState(OrderInfo orderInfo);



    
}
