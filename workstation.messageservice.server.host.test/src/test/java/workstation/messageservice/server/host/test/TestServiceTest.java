package workstation.messageservice.server.host.test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import workstation.messageservice.services.TestService;

/**
 * Created by Administrator on 2016/11/17.
 */
public class TestServiceTest {
    @Test
    public void testTestService() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring/*.xml");
        context.start();

        TestService service = context.getBean(TestService.class);

        String ver = service.getVersion();

        Assert.assertEquals("1.0", ver);
    }
}
