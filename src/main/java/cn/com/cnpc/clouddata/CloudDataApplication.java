package cn.com.cnpc.clouddata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class CloudDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudDataApplication.class, args);
    }

}
