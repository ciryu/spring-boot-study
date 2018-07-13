package com.developlee.j2eespingboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class J2eeSpingBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(J2eeSpingBootApplication.class, args);
	}
        /**
        public static void main(String[] args) {
		//关闭banner
		SpringApplication application = new SpringApplication(ReadingNotesApplication.class);
		application.setBannerMode(Banner.Mode.OFF); //springboot2.0关闭banner 自自定义banner只要在resource 放入banner.txt即可
		application.run(args);
		//SpringApplication.run(ReadingNotesApplication.class, args);
	}
*/
}
