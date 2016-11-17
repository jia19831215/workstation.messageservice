package workstation.messageservice.server.host;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import workstation.core.utils.StringUtil;

import java.io.FileWriter;

/**
 * Created by Administrator on 2016/11/16.
 */

@ComponentScan
@EnableAutoConfiguration
@ImportResource({"classpath:spring/api.provider.xml"})
public class Server {
    public static void main(String[] args) throws Exception {

        try {
            SpringApplication.run(Server.class, args);

            System.out.println("服务启动");

            System.in.read();
        } catch (Exception ce) {
            FileWriter writer = new FileWriter("D:\\e.txt");
            writer.write(StringUtil.getStackTrace(ce));
            writer.flush();
            writer.close();
        }
    }
}
