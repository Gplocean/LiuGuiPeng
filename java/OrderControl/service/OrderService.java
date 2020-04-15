package OrderControl.service;


import OrderControl.dao.OrderDao;
import OrderControl.entity.OrderInfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import util.AppResponse;

import java.util.List;
@Service
public class OrderService {
    @Autowired

    private OrderDao orderDao;
    @Transactional(rollbackFor = Exception.class)




    /**
     * 查询订单列表
     * @param orderInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse listOrderByPage(OrderInfo orderInfo){

        PageHelper.startPage(orderInfo.getPageNum(), orderInfo.getPageSize());
        List<OrderInfo> orderInfoList = orderDao.listOrderByPage(orderInfo);
        PageInfo<OrderInfo> pageData = new PageInfo<>(orderInfoList);

        return AppResponse.success("从数据库查询成功!", pageData);

    }

    /**
     * 查询订单详情
     * @param orderInfo
     * @return
     * @author 刘桂鹏
     */
    public AppResponse listOrder(OrderInfo orderInfo) {
        List<OrderInfo> orderInfoList  = orderDao.listOrder(orderInfo);
        return AppResponse.success("查询成功！", orderInfoList);
    }
    /**
     * 修改订单状态
     *  @param orderInfo
     * @return
     * @author 刘桂鹏
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateOrder(OrderInfo orderInfo) {
        AppResponse appResponse = AppResponse.success("修改成功");
        int count = orderDao.updateOrderState(orderInfo);
        if (0 == count) {
            appResponse = AppResponse.versionError("数据有变化，请刷新！");
            return appResponse;
        }
        return appResponse;
    }

}
