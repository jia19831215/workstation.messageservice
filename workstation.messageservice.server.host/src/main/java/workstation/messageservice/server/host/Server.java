package workstation.messageservice.server.host;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2016/11/16.
 */

@ComponentScan
public class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);
    }
}
