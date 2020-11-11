package cn.signit.hospitalpigeonholeapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "cn.signit")
@EnableDiscoveryClient
@MapperScan("cn.signit.hospital.dao")
public class HospitalPigeonholeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalPigeonholeAppApplication.class, args);
	}

}
