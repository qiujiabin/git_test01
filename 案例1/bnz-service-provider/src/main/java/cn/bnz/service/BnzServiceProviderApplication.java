package cn.bnz.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("cn.bnz.service.mapper")

public class BnzServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BnzServiceProviderApplication.class, args);
    }

}
