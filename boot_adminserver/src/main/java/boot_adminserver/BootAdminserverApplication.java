package boot_adminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//http://localhost:8899
@EnableAdminServer//开启监控功能
@SpringBootApplication
public class BootAdminserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootAdminserverApplication.class, args);
    }

}
