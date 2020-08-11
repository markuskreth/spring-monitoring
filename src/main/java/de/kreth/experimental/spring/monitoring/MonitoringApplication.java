package de.kreth.experimental.spring.monitoring;

import org.springframework.boot.ResourceBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class MonitoringApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(MonitoringApplication.class);
		app.setBanner(new ResourceBanner(new ClassPathResource("banner.txt")));
		app.run(args);
		
//		new SpringApplicationBuilder()
//			.sources(MonitoringApplication.class)
//			.child(MonitoringApplication.class)
//			.banner(new ResourceBanner(new ClassPathResource("banner.txt")))
////			.bannerMode(Mode.OFF)
//			.run(args);
	}

}
