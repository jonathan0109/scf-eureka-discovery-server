package mx.unnamed.scf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ScfEurekaDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScfEurekaDiscoveryServerApplication.class, args);
	}

}
