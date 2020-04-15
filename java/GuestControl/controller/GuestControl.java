package GuestControl.controller;

import GuestControl.entity.GuestInfo;
import GuestControl.service.GuestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.AppResponse;

import javax.annotation.Resource;

@RestController
@RequestMapping("/pc/client")
public class GuestControl {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Resource
    private GuestService guestService;

    /**
     * 查询客户列表
     * @param guestInfo
     * @return
     */

    @PostMapping("/listClients")
    public AppResponse listGuestByPage(GuestInfo guestInfo) {
        try {
            return guestService.listGuestByPage(guestInfo);
        } catch (Exception e) {
            logger.error("查询客户列表异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }


}
