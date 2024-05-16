package com.example.phonenumberlb;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@LoadBalancerClient(name = "example-service", configuration = ServerInstanceConfiguration.class)
class WebClientConfig {
    @LoadBalanced
    @Bean
    public  WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }
}