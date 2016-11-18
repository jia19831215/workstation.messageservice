package workstation.messageservice.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import workstation.messageservice.dao.PublishInfoDao;
import workstation.messageservice.services.TestService;

/**
 * Created by Administrator on 2016/11/17.
 */

public class TestServiceImpl implements TestService {

    @Autowired
    private PublishInfoDao publishInfoDao;

    @Override
    public String getVersion() {

        return publishInfoDao.getVer();
    }
}
