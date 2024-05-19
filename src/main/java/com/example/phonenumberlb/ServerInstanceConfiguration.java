package com.example.phonenumberlb;


import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerInstanceConfiguration {
    @Bean
    public ServiceInstanceListSupplier ReadOnlyServiceInstanceListSupplier() {
        return new ReadOnlyServerInstanceSupplier("ro-service");
    }

}
