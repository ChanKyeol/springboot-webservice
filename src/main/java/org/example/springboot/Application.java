
/*
이 Application class는 이 포로젝트의 메인 클래스이다.
@springbootapplication으로 인해 스프링 부트의 자동설정, 스프링bean 읽기와 생성을 모두 자동으로 설정한다.
특히나 @springbootapplication이 있는 위치부터 설정을 읽어가기 때문에 이 프로젝트는 항상 최상단에 위치해야 한다.
 */
package org.example.springboot;

import org.springframework.boot.SpringApplication;
import  org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    } // >> 내장 WAS를 실행

}
