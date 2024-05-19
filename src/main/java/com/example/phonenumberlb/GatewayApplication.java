package com.example.phonenumberlb;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Bean
    public RouteLocator routerBuilder(RouteLocatorBuilder routeLocatorBuilder){
        return routeLocatorBuilder.routes().route("roInstance",r->r.path("/api/getAllUsersData**","/api/getUser**","/api/searchUsers**")
                        .uri("lb://ro-service"))
                .route("rwInstance",r->r.path("/api/addUser**","/api/deleteUser**","/api/editUser**","/api/updatePhoneNumber**")
                        .uri("http://localhost:8081")).build();
    }
}
