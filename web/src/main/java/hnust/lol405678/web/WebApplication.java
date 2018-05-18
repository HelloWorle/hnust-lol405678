package hnust.lol405678.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author panxin
 */
@SpringBootApplication
public class WebApplication {

    public static void main( String[] args ) {
        SpringApplication.run(WebApplication.class, args);
    }

}
