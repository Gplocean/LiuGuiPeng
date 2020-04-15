package GuestControl.service;


import GuestControl.dao.GuestDao;
import GuestControl.entity.GuestInfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import util.AppResponse;

import java.util.List;

public class GuestService {
    @Autowired

    private GuestDao guestDao;
    @Transactional(rollbackFor = Exception.class)
    
    /**
     * 查询客户列表
     * @param guestInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse listGuestByPage(GuestInfo guestInfo){

        PageHelper.startPage(guestInfo.getPageNum(), guestInfo.getPageSize());
        List<GuestInfo> guestInfoList = guestDao.listGuestByPage(guestInfo);
        PageInfo<GuestInfo> pageData = new PageInfo<>(guestInfoList);

        return AppResponse.success("从数据库查询成功!", pageData);

    }


}
