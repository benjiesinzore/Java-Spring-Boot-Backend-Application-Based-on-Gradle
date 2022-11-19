package com.benjamin.sinzore.springbackendapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbackendapplicationApplication {

	public static void main(String[] args) {

		try {

			SpringApplication.run(SpringbackendapplicationApplication.class, args);
		} catch (Exception ee){
			ee.printStackTrace();
		}

	}

}
