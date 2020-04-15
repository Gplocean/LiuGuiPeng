package GuestControl.dao;

import GuestControl.entity.GuestInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**@ClassName GuestDao
 * @author 刘桂鹏
 * @time  2020-04-13
 */
@Mapper
public interface GuestDao {
    /**

     /**
     *查询用户列表
     * @param guestInfo
     * @return
     */
    List<GuestInfo> listGuestByPage(GuestInfo guestInfo);




}
