package workstation.messageservice.services.impl;

import org.springframework.stereotype.Component;
import workstation.messageservice.services.TestService;

/**
 * Created by Administrator on 2016/11/17.
 */

public class TestServiceImpl implements TestService {

    @Override
    public String getVersion() {
        return "1.0.0.0";
    }
}
