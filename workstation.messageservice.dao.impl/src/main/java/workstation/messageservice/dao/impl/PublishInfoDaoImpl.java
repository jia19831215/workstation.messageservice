package workstation.messageservice.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import workstation.messageservice.dao.PublishInfoDao;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/11/18.
 */

@Repository
public class PublishInfoDaoImpl implements PublishInfoDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String getVer() {

        List<Map<String, Object>> data = jdbcTemplate.queryForList("SELECT * FROM cant");

        return "1.0";
    }
}
