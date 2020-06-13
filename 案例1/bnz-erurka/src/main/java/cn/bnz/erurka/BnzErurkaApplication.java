package cn.bnz.erurka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BnzErurkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BnzErurkaApplication.class, args);
    }

}
