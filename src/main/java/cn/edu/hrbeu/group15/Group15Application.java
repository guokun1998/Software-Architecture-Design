package cn.edu.hrbeu.group15;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class Group15Application {

    public static void main(String[] args) {
        SpringApplication.run(Group15Application.class, args);
    }

}
