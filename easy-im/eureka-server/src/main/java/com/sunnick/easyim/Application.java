package com.sunnick.easyim;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Sunnick on 2019/1/28/028.
 */

@EnableEurekaServer
@SpringBootApplication
public class Application {
    public static void main(String[] s){
        new SpringApplicationBuilder(Application.class).web(true).run(s);
    }
}