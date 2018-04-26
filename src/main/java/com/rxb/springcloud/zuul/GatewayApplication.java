package com.rxb.springcloud.zuul;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by ren.xiaobo on 2018/4/26.
 */
@SpringBootApplication
@EnableZuulProxy
public class GatewayApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //do something
    }
}
