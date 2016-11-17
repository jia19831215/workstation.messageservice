package workstation.messageservice.server.host;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Administrator on 2016/11/16.
 */

@ComponentScan
@EnableAutoConfiguration
@ImportResource({ "classpath:" })
public class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);
    }
}
