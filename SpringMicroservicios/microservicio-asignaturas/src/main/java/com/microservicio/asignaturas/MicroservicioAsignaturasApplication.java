package com.microservicio.asignaturas;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient 
@SpringBootApplication
@EnableFeignClients(basePackages = "com.microservicio.asignaturas.cliente")
public class MicroservicioAsignaturasApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroservicioAsignaturasApplication.class, args);
    }
}
