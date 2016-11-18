package workstation.messageservice.dao.impl;

import org.springframework.stereotype.Repository;
import workstation.messageservice.dao.PublishInfoDao;

/**
 * Created by Administrator on 2016/11/18.
 */

@Repository
public class PublishInfoDaoImpl implements PublishInfoDao {
    @Override
    public String getVer() {
        return "1.0";
    }
}
