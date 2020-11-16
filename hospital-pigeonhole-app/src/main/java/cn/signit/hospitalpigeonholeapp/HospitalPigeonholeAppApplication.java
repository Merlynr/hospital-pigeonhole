package cn.signit.hospitalpigeonholeapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "cn.signit")
@EnableDiscoveryClient
@MapperScan("cn.signit.hospital.dao")
//@EnableFeignClients
public class HospitalPigeonholeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalPigeonholeAppApplication.class, args);
	}

}
