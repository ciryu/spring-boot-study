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
		//�ر�banner
		SpringApplication application = new SpringApplication(ReadingNotesApplication.class);
		application.setBannerMode(Banner.Mode.OFF); //springboot2.0�ر�banner ���Զ���bannerֻҪ��resource ����banner.txt����
		application.run(args);
		//SpringApplication.run(ReadingNotesApplication.class, args);
	}
*/
}
