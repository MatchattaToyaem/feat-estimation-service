package feetarcestimation.service;

import nu.pattern.OpenCV;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceApplication {

	public static void main(String[] args) {
		OpenCV.loadLocally();
		SpringApplication.run(ServiceApplication.class, args);
	}

}
